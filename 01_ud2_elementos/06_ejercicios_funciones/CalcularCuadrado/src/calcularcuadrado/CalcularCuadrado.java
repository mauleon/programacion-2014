package calcularcuadrado;

public class CalcularCuadrado {

    static int cuadrado( int n ) {
    
        int r = 0;

        int j = 1;
        for (int i = 0; i < n; i++) {
            r = r + j;
            j = j + 2;
        }
        
        return r;
    }
    
    
    public static void main(String[] args) {

        System.out.println("El cuadrado de 5 es: "+cuadrado(5));

    }

}
