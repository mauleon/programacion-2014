package ejercicioalumnoasignatura;

/**
 *
 * @author widemos
 */
public class Asignatura {

    // Propiedades de la asignatura
    private String nombre = null;
    private int horasSemanales = 0;

    // Asociación N:M con Alumno
    private Alumno[] alumnos = null;

    // Constructor
    public Asignatura() {
        alumnos = new Alumno[EjercicioAlumnoAsignatura.MAX_ALUMNOS];
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Alumno[] getAlumnos() { // No generamos el setAlumnos()
        return alumnos;
    }

    // Método toString() para mostrar en pantalla la asignatura más cómodamente
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", horasSemanales=" + horasSemanales + '}';
    }

}
