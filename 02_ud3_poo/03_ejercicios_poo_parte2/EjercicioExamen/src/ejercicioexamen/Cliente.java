package ejercicioexamen;

import static ejercicioexamen.EjercicioExamen.MAX_REPARACIONES;

public class Cliente {

    private Reparacion[] reparaciones = new Reparacion[MAX_REPARACIONES];

    // Propiedades
    private String nombre;
    private String apellidos;
    private String DNI;
    private String email;

    // Métodos
    public void misReparaciones() {

        int i = 0;
        while (i < MAX_REPARACIONES && reparaciones[i] != null) {
            System.out.println(reparaciones[i]);
            i++;
        }

    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }

    public Reparacion[] getReparaciones() {
        return reparaciones;
    }

}
