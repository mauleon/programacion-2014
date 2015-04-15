package conversionbinario;

public class ConversionBinario {
    
    static String binario( int n ) {

        String r = "";
        
        while( n > 0 ) {
            r = n%2 + r;
            n = n / 2;
        }
        
        return "0b" + r;
    }
    
    public static void main(String[] args) {

        System.out.println("El valor binario de 26 es: "+binario(26));

    }

}
