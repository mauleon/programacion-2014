package ejerciciocast;

public class EjercicioCast {

    public static void main(String[] args) {

        String s = "cadena";
        int e = 64;
        char c = 'A';

        c = (char) e;
        
        s = e+"";
        s = String.valueOf(e);

        System.out.println(c);
        System.out.println(s);
        
    }

}
