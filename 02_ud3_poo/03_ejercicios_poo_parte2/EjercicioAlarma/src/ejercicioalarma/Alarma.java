package ejercicioalarma;

import java.util.Random;

/**
 *
 * @author widemos
 */
public class Alarma {

    // Propiedades
    private int PIN;
    private boolean activada;
    private int telefonoAviso;

    // Métodos
    public void consultarSensores() {
        // Recorrer los sensores
        for (int i = 0; i < numSensores; i++) {
            // Consultar si hay movimiento
            if (sensores[i].hayMovimiento()) {
                // Hay movimiento, nos están ROBANDO!!!!
                System.out.println("ALARMA: Hay movimiento en el sensor " + (i + 1));
                System.out.println("INFO: Llamando al número " + telefonoAviso);
            } else {
                // Todo va bien...
            }
        }
    }

    public void activar() {
        activada = true;
        System.out.println("INFO: Alarma activada...");
    }

    private int intentos = 0;

    public void desactivar(int PIN) {
        // Si el PIN coincide desactivamos la alarma
        if (PIN == this.PIN) {
            activada = false;
            System.out.println("INFO: Alarma desactivada");
        } else {
            // Intento consumido
            intentos++;

            // Comprobamos si quedan o no intentos
            if (intentos < 3) {
                System.out.println("INFO: Te quedan " + (3 - intentos) + " intentos");
            } else {
                System.out.println("ALARMA: Nos vuelven a robar...");
            }
        }
    }

    // Relación
    private SensorMovimiento[] sensores = null;

    private int numSensores;

    // Constructor
    public Alarma() {
        // Generar el array
        sensores = new SensorMovimiento[5];

        // Elegir un número al azar entre 1 y 5
        Random r = new Random();
        numSensores = r.nextInt(5) + 1;

        // Generar entre 1 y 5 sensores y colgarlos del array
        for (int i = 0; i < numSensores; i++) {
            sensores[i] = new SensorMovimiento();  // Alarma -> Sensor
            sensores[i].setAlarma(this);  // Sensor -> Alarma            
        }

        // Generar el PIN de la alarma
        PIN = r.nextInt(10000);
        System.out.println("PIN: " + PIN);
    }

    // Métodos de acceso
    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }

    public SensorMovimiento[] getSensores() {
        return sensores;
    }

}
