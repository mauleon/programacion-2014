package ejerciciolibroinfantil;

/**
 *
 * @author widemos
 */
public class LibroInfantil extends Libro {

    private int edadRecomendada = 18;

    public boolean esRecomendable( int edadNinyo ) {
        return edadNinyo >= edadRecomendada;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }
    
    
}
