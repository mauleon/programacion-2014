package conversionhexadecimal;

public class ConversionHexadecimal {

    static String hexadecimal( int n ) {

        String r = "";
        
        while( n > 0 ) {
            int resto = n%16;

            if( resto <= 9 ) {
                r = resto + r;
            }
            else
            {
                switch (resto) {
                    case 10:
                        r = "A" + r;
                        break;
                    case 11:
                        r = "B" + r;
                        break;
                    case 12:
                        r = "C" + r;
                        break;
                    case 13:
                        r = "D" + r;
                        break;
                    case 14:
                        r = "E" + r;
                        break;
                    case 15:
                        r = "F" + r;
                        break;
                    default:
                }
            }
            n = n / 16;
        }
        
        return "0x" + r;
    }
    
    
    public static void main(String[] args) {

        System.out.println("El valor hexadecimal de 26 es: "+hexadecimal(26));


    }

}
