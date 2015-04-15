package ejercicio3alumnos;

public class Ejercicio3Alumnos {

    public static void main(String[] args) {

        Alumno[] alumnos = null;  // 1
                
               // 3
        alumnos = new Alumno[5];  // 2
        
        for (int i = 0; i < 5; i++) {
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
    }

}
