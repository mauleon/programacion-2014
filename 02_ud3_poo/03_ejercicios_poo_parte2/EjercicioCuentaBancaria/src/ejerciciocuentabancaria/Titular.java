package ejerciciocuentabancaria;

/**
 *
 * @author widemos
 */
public class Titular {

    // Propiedades
    private String nombre = null;
    private String apellidos = null;
    private String DNI = null;
    private String fechaAlta = null;

    // Asociación N:M con CuentaBancaria 
    private CuentaBancaria[] cuentas = null;

    // Constructor
    public Titular() {
        cuentas = new CuentaBancaria[EjercicioCuentaBancaria.MAX_CUENTAS];
    }

    // Método toString()
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public CuentaBancaria[] getCuentas() { // No generamos setCuentas()
        return cuentas;
    }

}
