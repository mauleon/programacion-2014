package ejercicioempresaempleado;

/**
 *
 * @author widemos
 */
public class Empresa {
    
    private String nombre;
    private String anyoFundacion;

    // N
    private Empleado[] empleados = new Empleado[100];
    
    /*public Empresa() {
        empleados = new Empleado[100];
    }*/
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", anyoFundacion=" + anyoFundacion + '}';
    }

    
}
