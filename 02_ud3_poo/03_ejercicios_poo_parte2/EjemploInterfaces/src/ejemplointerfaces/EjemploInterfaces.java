package ejemplointerfaces;

public class EjemploInterfaces {

    public static void main(String[] args) {

        Trompeta trompeta = new Trompeta();
        Tambor tambor = new Tambor();

        trompeta.sonar(60);
        tambor.sonar(90);

        Sirena sirena = new Sirena();
        sirena.sonar(10);

        Sonoro[] ruidosos = new Sonoro[10];

        ruidosos[0] = trompeta;
        ruidosos[1] = tambor;
        ruidosos[2] = sirena;

        for (int i = 0; i < 3; i++) {

            int volumen = 0;

            if (ruidosos[i] instanceof Trompeta) {
                System.out.println("Me he encontrado una trompeta...");
                volumen = 50;
            } else {
                if (ruidosos[i] instanceof Tambor) {
                    System.out.println("Me he encontrado un tambor...");
                    volumen = 100;
                } else {
                    if (ruidosos[i] instanceof Sirena) {
                        System.out.println("Me he encontrado una sirena...");
                        volumen = 30;
                    }
                }
            }
            ruidosos[i].sonar(volumen);
        }

        for (int i = 0; i < 3; i++) {

            int volumen = 0;

            if (ruidosos[i] instanceof InstrumentoMusical) {
                System.out.println("Me he encontrado un instrumento musical...");
                volumen = 50;
            } else {
                    if (ruidosos[i] instanceof Sirena) {
                        System.out.println("Me he encontrado una sirena...");
                        volumen = 30;
                    }
            }
            ruidosos[i].sonar(volumen);
        }
    
    
    }

}
