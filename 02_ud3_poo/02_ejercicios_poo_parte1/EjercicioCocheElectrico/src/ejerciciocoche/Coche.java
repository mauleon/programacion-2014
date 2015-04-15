package ejerciciocoche;

/**
 *
 * @author widemos
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int color;

    
    private Motor [] motores = new Motor[100];
    private Rueda [] ruedas = new Rueda[4];
    private Puerta [] puertas = new Puerta[5];
    
    public Coche() {
        marca = "Opel";
        modelo = "Zafira";
        color = 153;
        
        //motores[0] = new Motor();

        MotorCombustionInterna m = new MotorCombustionInterna();
        m.setCilindrada(1900);
        m.setCombustible("diesel");
        m.setPotencia(110);
        
        motores[0] = m;
        
        MotorElectrico e = new MotorElectrico();
        e.setTipoBateria("litio");
        e.setPotencia(40);
        
        motores[1] = e;
        
        
/*      motores[0].setCilindrada(1900);
        motores[0].setCombustible("carbón");
        motores[0].setPotencia(110); */
        
        ruedas[0] = new Rueda();
        ruedas[0].setDiametro("195/65R15");
        ruedas[1] = new Rueda();
        ruedas[1].setDiametro("195/65R15");
        ruedas[2] = new Rueda();
        ruedas[2].setDiametro("195/65R15");
        ruedas[3] = new Rueda();
        ruedas[3].setDiametro("195/65R15");
        
        for (int i = 0; i < 5; i++) {
            puertas[i] = new Puerta();
            puertas[i].setElevalunasElectrico(true);
        }
        
        
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    
}
