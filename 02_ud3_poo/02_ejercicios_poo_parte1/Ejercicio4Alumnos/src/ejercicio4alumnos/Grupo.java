package ejercicio4alumnos;

/**
 *
 * @author widemos
 */
public class Grupo {
    
    private int codigo;
    
    private Alumno[] alumnos = null;  // 1

    
    public Grupo() {
               // 3
        alumnos = new Alumno[5];  // 2    
        
        
/*        for (int i = 0; i < 5; i++) {
                      // 5
            alumnos[i] = new Alumno(); // 4
            
            alumnos[i].setNombre("Ion "+i);
            alumnos[i].setApellidos("Jaureguialzo");
            alumnos[i].setDNI("3746534");
            alumnos[i].setTelefono("000"+i);
        }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos[i]);
        }
        
        */
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    // No generar el setter del array!!!!
    /*
    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
    */
}
