package ejerciciodosmatrices4x4;

import java.util.Random;

public class EjercicioDosMatrices4x4 {

    public static void main(String[] args) {

        /*Haz un programa que genere dos matrices aleatorias de 4x4 elementos y que calcule y
         muestre su suma, producto por un escalar, producto y traspuesta.*/
        //1ª matriz
        int[][] m = new int[4][4];
        Random generador = new Random();
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                m[f][c] = generador.nextInt(100);
            }
        }
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                System.out.format("%4d", m[f][c]);
            }
            System.out.println();
        }

        //2ª matriz
        System.out.println();
        int[][] matriz = new int[4][4];
        Random generador1 = new Random();
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                matriz[f][c] = generador1.nextInt(100);
            }
        }
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                System.out.format("%4d", matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println();

        //matriz suma de las anteriores;
        int[][] suma = new int[4][4];
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {

                suma[f][c] = m[f][c] + matriz[f][c];
            }

        }

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.format("%4d", suma[f][c]);
            }
            System.out.println();
        }

        //PRoducto:
        System.out.println();
        int[][] producto = new int[4][4];
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                for (int h = 0; h < 4; h++) {

                    producto[i][j] += m[i][h] * matriz[h][j];
                }
                System.out.format("%6d", producto[i][j]);
            }

            System.out.println();
        }
    }

}
