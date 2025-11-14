import java.util.Random;
import java.util.Scanner;

public class CuadradoMagicoRandom {

    public static void main(String[] args) {
        new CuadradoMagicoRandom().ejecutar();
    }


    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("El tamaño debe ser al menos 3.");
            return;
        }

        int intentos = 0;
        int[][] cuadrado;

        do {
            intentos++;
            cuadrado = generarCuadrado(n);
        } while (!esMagico(cuadrado));

        System.out.println("\nCuadrado mágico encontrado en " + intentos + " intentos:\n");
        imprimirCuadrado(cuadrado);
    }

    //generacion de cuadrado magico:
    private int[][] generarCuadrado(int n) {
        Random rand = new Random();
        int[][] cuadrado = new int[n][n];

        // Generamos números aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado[i][j] = rand.nextInt(n * n) + 1;
            }
        }

        return cuadrado;
    }

    //comprobacion con un metodo boolean si es magico:
    private boolean esMagico(int[][] cuadrado) {
        int n = cuadrado.length;
        int sumaObjetivo = 0;

        // Suma de la primera fila
        for (int j = 0; j < n; j++) {
            sumaObjetivo += cuadrado[0][j];
        }

        // Verificacion de filas:
        for (int i = 1; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != sumaObjetivo) return false;
        }

        // Verifiacion de columnas:
        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += cuadrado[i][j];
            }
            if (sumaCol != sumaObjetivo) return false;
        }

        //verificacion de columnas:
        int sumaDiag1 = 0;
        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += cuadrado[i][i];
            sumaDiag2 += cuadrado[i][n - 1 - i];
        }
        if (sumaDiag1 != sumaObjetivo || sumaDiag2 != sumaObjetivo) return false;

        return true; // Es mágico
    }
    //Imprimir el cuadrado:
    private void imprimirCuadrado(int[][] cuadrado) {
        for (int[] fila : cuadrado) {
            for (int val : fila) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}
