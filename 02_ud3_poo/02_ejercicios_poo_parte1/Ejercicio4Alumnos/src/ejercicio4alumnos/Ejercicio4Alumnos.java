package ejercicio4alumnos;

public class Ejercicio4Alumnos {

    public static void main(String[] args) {

        Grupo g = new Grupo();
        
        for (int i = 0; i < 5; i++) {
                      // 5
            //alumnos[i] = new Alumno(); // 4
            g.getAlumnos()[i] = new Alumno();
            
            g.getAlumnos()[i].setNombre("Ion "+i);
            g.getAlumnos()[i].setApellidos("Jaureguialzo");
            g.getAlumnos()[i].setDNI("3746534");
            g.getAlumnos()[i].setTelefono("000"+i);
        }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println(g.getAlumnos()[i]);
        }
        
    }

}
