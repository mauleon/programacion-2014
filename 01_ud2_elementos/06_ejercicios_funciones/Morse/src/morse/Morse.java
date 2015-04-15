package morse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Morse {

    static String morse( String cadena ) {
    
        String m = "";
        
        cadena = cadena.toUpperCase();

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'H':
                    m += "....";
                    break;
                case 'O':
                    m += "---";
                    break;
                case 'L':
                    m += ".-..";
                    break;
                case 'A':
                    m += ".-";
                    break;
                default:
                    m += " ? ";
            }
        }
        
        return m;
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escribe tu mensaje: ");
        String s = br.readLine();
        System.out.println(morse(s));
    }

}
