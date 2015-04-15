package ejerciciojugueteria;

/**
 *
 * @author widemos
 */
public class Tienda {
    
    private String nombre;
    private String ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
