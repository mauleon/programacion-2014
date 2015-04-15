package ejerciciodulces;

/**
 *
 * @author widemos
 */
public class Dulce {
    
    private int calorias;
    private double peso;
    
    public void comer( double cantidad ) {
        peso -= cantidad;
        System.out.println("Comiendo: "+cantidad+", queda: "+peso);
    }

    
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
