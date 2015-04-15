/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugueteria;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Trabajo
 */
public class Comprador {
    
    private List<Juguete> cjuguetes = new LinkedList<>();
    
    private String nombre;
    private String apellidos;
    private String email;

    @Override
    public String toString() {
        return "Comprador{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cjuguetes
     */
    public List<Juguete> getCjuguetes() {
        return cjuguetes;
    }
    
}
