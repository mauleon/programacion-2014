package ejercicioalarma;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class SensorMovimiento {

    // Propiedades
    private int umbral;

    // Métodos
    public boolean hayMovimiento() {
        boolean movimiento = false;

        // Elegir el valor entre 1 y 100
        Random r = new Random();
        int numero = r.nextInt(100) + 1;

        // Comparar con el umbral
        if (numero > umbral) {
            movimiento = true;
        }

        return movimiento;
    }

    // Relación
    private Alarma alarma = null;

    // Constructor
    public SensorMovimiento() {

        // Valor del umbral entre 1 y 100
        Random r = new Random();
        umbral = r.nextInt(100) + 1;

    }

    // Métodos de acceso
    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

}
