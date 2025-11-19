package BingoApp;

import java.util.Random;

public class Carton {

    private int[][] nums;           // numeros de carton
    private boolean[][] marcados;  // posiciones marcadas
    private int tamano = 5;           // tamano

    public Carton() {
        nums = new int[tamano][tamano];
        marcados = new boolean[tamano][tamano];
        generarCarton();
    }

    // generamos el carton
    private void generarCarton() {
        boolean[] usados = new boolean[76];
        Random r = new Random();
        int numero;

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                do {
                    numero = r.nextInt(75) + 1;
                } while (usados[numero]);
                usados[numero] = true;
                nums[i][j] = numero;
            }
        }
    }

    // mosrtramos carton
    public void mostrar() {
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (marcados[i][j])
                    System.out.print(" -- ");
                else
                    System.out.printf("%02d  ", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // marca número
    public void marcar(int n) {
        for (int i = 0; i < tamano; i++)
            for (int j = 0; j < tamano; j++)
                if (nums[i][j] == n){
                    marcados[i][j] = true;
                }
    }

    // comprueba línea
    public boolean lineaHecha() {
        // horizontal
        for (int i = 0; i < tamano; i++) {
            boolean verdadero = true;
            for (int j = 0; j < tamano; j++)
                if (!marcados[i][j]){
                    verdadero = false;
                }
            if (verdadero){
                return true;
            }
        }

        // verticales
        for (int j = 0; j < tamano; j++) {
            boolean verdadero = true;
            for (int i = 0; i < tamano; i++)
                if (!marcados[i][j]) verdadero = false;
            if (verdadero) return true;
        }

        // primera diagona;
        boolean diag1 = true;
        for (int i = 0; i < tamano; i++)
            if (!marcados[i][i]) diag1 = false;

        // segunda diagonal
        boolean diag2 = true;
        for (int i = 0; i < tamano; i++)
            if (!marcados[i][tamano - 1 - i]) diag2 = false;

        return (diag1 || diag2);
    }

    // comprueba bingo
    public boolean bingoHecho() {
        for (int i = 0; i < tamano; i++)
            for (int j = 0; j < tamano; j++)
                if (!marcados[i][j]) return false;
        return true;
    }
}


