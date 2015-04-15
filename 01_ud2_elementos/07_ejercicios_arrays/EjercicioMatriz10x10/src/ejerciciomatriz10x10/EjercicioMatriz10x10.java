package ejerciciomatriz10x10;

import java.util.Random;

public class EjercicioMatriz10x10 {

    public static void main(String[] args) {

        double[][] m = new double[10][10];

        Random generador = new Random();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = generador.nextDouble();
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("%8.3f",m[i][j]);
            }
            System.out.println();
        }
    }

}
