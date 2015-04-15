package ejemplointerfaces;

/**
 *
 * @author widemos
 */
public class Trompeta extends InstrumentoMusical {

    @Override
    public void sonar(int volumen) {
        System.out.println("TROMPETA, sonando con volumen: "+volumen);
    }
    
}
