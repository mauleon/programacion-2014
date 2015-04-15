package ejemploswitch;

public class EjemploSwitch {

    public static void main(String[] args) {

        int numero = 8;

        switch (numero) {
            case 1:
                // 1
                System.out.println("Has elegido 1");
                break;
            case 2:
                // 2
                System.out.println("Has elegido 2");
                break;
            case 3:
                // 3
                System.out.println("Has elegido 3");
                break;
            case 4:
                // 4
                System.out.println("Has elegido 4");
                break;
            default:
                System.out.println("No se que has elegido pero no lo entiendo.");
                break;
        }

        if (numero == 1) {
            // 1
        } else if (numero == 2) {
            // 2
        } else if (numero == 3) {
            // 3
        } else if (numero == 4) {
            // 4
        }

        
        switch (numero) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }
        
        
    }

}
