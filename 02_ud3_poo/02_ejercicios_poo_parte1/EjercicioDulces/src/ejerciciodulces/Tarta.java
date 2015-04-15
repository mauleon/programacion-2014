package ejerciciodulces;

/**
 *
 * @author widemos
 */
public class Tarta extends Chocolate {

    @Override
    public void comer(double cantidad) {
        super.comer(cantidad); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lanzar( String objetivo ) {
        System.out.println("¡¡¡Lanzando la tarta a "+objetivo+"!!!");
    }
}
