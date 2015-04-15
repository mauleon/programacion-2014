package ejemplointerfaces;

/**
 *
 * @author widemos
 */
public class Tambor extends InstrumentoMusical {

    @Override
    public void sonar(int volumen) {
        System.out.println("TAMBOR, sonando con volumen: "+volumen);
    }
    
}
