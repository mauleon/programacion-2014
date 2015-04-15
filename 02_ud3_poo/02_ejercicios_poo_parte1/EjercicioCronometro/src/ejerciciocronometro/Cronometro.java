package ejerciciocronometro;

/**
 *
 * @author widemos
 */
public class Cronometro {
    
    private long horaInicio;
    
    public Cronometro() {
        horaInicio = System.nanoTime();
    }
    
    public void tiempoTranscurrido() {
        long intervalo = System.nanoTime() - horaInicio;
        System.out.println("Tiempo transcurrido: "+intervalo/1000000000);
    }
    
}
