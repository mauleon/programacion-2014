package arrayejer8;

import java.util.Random;

public class ArrayEjer8 {

    public static void main(String[] args) {

        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        Random r = new Random(4);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m1[i][j] = r.nextInt(5);
                m2[i][j] = r.nextInt(5);
                
                //m1[i][j] = (int) (Math.random() * 100);
                //m2[i][j] = (int) (Math.random() * 100);
            }
        }
        
        System.out.println("M1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", m1[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("M2");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", m2[i][j]);
            }
            System.out.println();
        }

        int[][] suma = new int[4][4];
        System.out.println("SUMA:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
                System.out.format("%8d", suma[i][j]);
            }
            System.out.println();
        }

        System.out.println("5*M1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", (5 * m1[i][j]));
            }
            System.out.println();
        }
        System.out.println("5*M2");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", (5 * m2[i][j]));
            }
            System.out.println();
        }

        
        
        
        int[][] producto = new int[4][4];
        
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    producto[i][j] = producto[i][j] + m1[i][k] * m2[k][j];
                }

            }
 
        }
        
        
        
        
        
        
        

        System.out.println("M1*M2");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%10d", producto[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("M1 TRASPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", m1[j][i]);
            }
            System.out.println();
        }
        System.out.println("M2 TRASPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%8d", m2[j][i]);
            }
            System.out.println();
        }

    }

}
