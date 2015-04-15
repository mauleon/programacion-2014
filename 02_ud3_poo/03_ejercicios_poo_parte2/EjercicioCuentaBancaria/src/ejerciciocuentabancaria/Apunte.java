package ejerciciocuentabancaria;

/**
 *
 * @author widemos
 */
public class Apunte {

    // Propiedades
    private double cantidad = 0;
    private String fecha = null;

    // Asociación con CuentaBancaria (este es el lado 1)
    private CuentaBancaria cuenta = null;

    // Métodos de acceso
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Apunte{" + "cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }

    // Experimento para hacer visible la destrucción del objeto
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.err.println("      INFO: Borrando " + this);
    }

}
