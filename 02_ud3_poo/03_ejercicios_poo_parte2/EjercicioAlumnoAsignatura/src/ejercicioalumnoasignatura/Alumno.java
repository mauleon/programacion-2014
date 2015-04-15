package ejercicioalumnoasignatura;

/**
 *
 * @author widemos
 */
public class Alumno {

    // Propiedades del alumno
    private String nombre = null;
    private String apellidos = null;
    private String email = null;

    // Asociación N:M con Asignatura
    private Asignatura[] asignaturas = null;

    // Constructor
    public Alumno() {
        asignaturas = new Asignatura[EjercicioAlumnoAsignatura.MAX_ASIGNATURAS];
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Asignatura[] getAsignaturas() { // No generamos el setAsignaturas()
        return asignaturas;
    }

    // Método toString() para mostrar en pantalla el alumno más cómodamente
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
}
