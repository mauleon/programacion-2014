package ejerciciofibonacci;

public class EjercicioFibonacci {

    public static void main(String[] args) {

        int i = 1;
        int j = 0;
        
        for (int k = 0; k < 20; k++) {

           /*
                t <- i+j
                i <- j
                j <- t
            
                devuelve j
            */
            
            int t = i+j;
            i = j;
            j = t;
           
            System.out.println(j);
        }


    }

}
