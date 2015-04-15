package ejemplointerfaces;

/**
 *
 * @author widemos
 */
public class Sirena implements Sonoro {

    @Override
    public void sonar(int volumen) {
        System.out.println("SIRENA, sonando con volumen: "+volumen);
    }
    
}
