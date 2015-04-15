package calcularnif;

public class CalcularNIF {
    
    static String NIF( int n ) {

        String NIF = ""+n;

        int resto = n % 23;
        
        switch (resto) {
            case 0:
                NIF += "T";
                break;
            default:
                NIF += "?";
        }
        
        return NIF;
    }

    static String NIF2( int n ) {

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";        
        return ""+ n + letras.charAt(n % 23);
    }
    
    
    public static void main(String[] args) {

        System.out.println("El NIF correspondiente al número 12345678 es: "+NIF(12345678));
        System.out.println("El NIF correspondiente al número 12345678 es: "+NIF2(12345678));

    }

}
