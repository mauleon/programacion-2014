package funcionparimpar;

public class FuncionParImpar {
    
    static boolean esPar( int valor ) {
        return valor % 2 == 0;
    }

    static boolean esImpar( int valor ) {
        return !esPar(valor);
    }
    
    public static void main(String[] args) {

        int n = 5;

        if( esPar(n) )
            System.out.println("El número es PAR.");
        else
            System.out.println("El número es IMPAR.");

    }

}
