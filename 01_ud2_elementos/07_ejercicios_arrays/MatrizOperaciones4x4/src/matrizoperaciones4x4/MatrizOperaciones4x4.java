package matrizoperaciones4x4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MatrizOperaciones4x4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matriz = new int[4][4];

        Random generador = new Random();
        int i = 0;
        int j = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = generador.nextInt(100);
            }
        }
        System.out.println("Matriz 1:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%3d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int[][] matriz2 = new int[4][4];

        generador = new Random();

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz2[i][j] = generador.nextInt(100);
            }
        }
        System.out.println("Matriz 2:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%3d", matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int suma[][] = new int[4][4];
        System.out.println("Suma de ambas matrices:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%4d", suma[i][j] = matriz[i][j] + matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("¿Qué valor quieres usar como escalar?: ");
        System.out.println();
        int valor = Integer.parseInt(br.readLine());

        int escalar[][] = new int[4][4];
        int escalar2[][] = new int[4][4];
        System.out.println("Producto escalar de la matriz 1:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%4d", escalar[i][j] = valor * matriz[i][j]);

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Producto escalar de la matriz 2:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%4d", escalar2[i][j] = valor * matriz2[i][j]);

            }
            System.out.println();
        }
        System.out.println();

        int multiplicacion[][] = new int[4][4];
        System.out.println("Multiplicación de ambas matrices:");
        for (i = 0; i < 4; i++) {

            

            for (j = 0; j < 4; j++) {

                for (int h = 0; h < 4; h++) {

                    multiplicacion[i][j] += matriz[i][h] * matriz2[h][j];
                }
                System.out.format("%6d",multiplicacion[i][j]);

            }
                System.out.println();
        }
        System.out.println();
        
        System.out.println("Matriz 1 traspuesta:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%4d", matriz[j][i]);
            }
            System.out.println();
        }
        
        System.out.println("Matriz 2 traspuesta:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                System.out.format("%4d",matriz2[j][i]);
            }
            System.out.println();
        }
        
    }
}