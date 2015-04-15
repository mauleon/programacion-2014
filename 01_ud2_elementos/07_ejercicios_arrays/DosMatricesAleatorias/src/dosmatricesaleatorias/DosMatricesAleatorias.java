package dosmatricesaleatorias;

import java.util.Random;

/*

 Haz un programa que genere dos matrices aleatorias de 4x4 elementos y que 
 calcule y muestre su suma, producto por un escalar, producto y traspuesta

 */
public class DosMatricesAleatorias {

    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matsuma = new int[4][4];
        int[][] matpesc = new int[4][4];
        int[][] matprod = new int[4][4];
        int[][] mattras = new int[4][4];
        Random r = new Random();

        int escalar = r.nextInt(5);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = r.nextInt(10);
                System.out.println("Matriz1.Pos. " + i + j + "= " + matriz1[i][j]);
                matriz2[i][j] = r.nextInt(10);
                System.out.println("Matriz2.Pos. " + i + j + "= " + matriz2[i][j]);
                matsuma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.println("MatrizS.Pos. " + i + j + "= " + matsuma[i][j]);
                System.out.println("El escalar vale " + escalar);
                matpesc[i][j] = matriz1[i][j] * escalar;
                System.out.println("MatrizE.Pos. " + i + j + "= " + matpesc[i][j]);
            }
        }
        // el producto es la suma de cada fila de la primera por la columna de la 2
        // y la traspuesta es cambiar filas y columnas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    matprod[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                mattras[i][j] = matriz1[j][i];
            }

        }
        for (int l = 0; l < 4; l++) {
            for (int m = 0; m < 4; m++) {
                System.out.println("MatrizP.Pos. " + l + m + "= " + matprod[l][m]);
            }

        }
    }

}
