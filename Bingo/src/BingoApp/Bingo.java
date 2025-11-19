package BingoApp;

import java.util.Scanner;

public class Bingo {

    private Carton carton;               // carton del jugador
    private boolean[] numsUsados; //(array)    // numeros ya usados
    private Scanner sc = new Scanner(System.in);

    //controller:

    public Bingo() {
        carton = new Carton();
        numsUsados = new boolean[76];

    }


    // incializamos l apratida
    public void iniciar() {
        System.out.println("Carton generado:");
        carton.mostrar();

        boolean lineaDada = false;

        while (true) {
            int n = pedirNumero();
            carton.marcar(n);
            carton.mostrar();

            if (!lineaDada && carton.lineaHecha()) {
                System.out.println("Linea completada.");
                lineaDada = true;
            }

            if (carton.bingoHecho()) {
                System.out.println("Bingo,ganaste!");
                break;
            }

        }

    }

    // pedimos numero :
    private int pedirNumero() {
        int n;
        while (true) {
            System.out.print("Introduce numero (1 - 75): ");
            n = sc.nextInt();

            if (n < 1 || n > 75) {
                System.out.println("Numero no valido.");
                continue;
            }
            if (numsUsados[n]) {
                System.out.println("El numero ya se ha usado antes.");
                continue;
            }
            numsUsados[n] = true;
            return n;
        }

    }
}

