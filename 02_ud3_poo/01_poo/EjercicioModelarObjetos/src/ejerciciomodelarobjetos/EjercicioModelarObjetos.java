package ejerciciomodelarobjetos;

public class EjercicioModelarObjetos {

    public static void main(String[] args) {

        Alumno a = new Alumno();
        
        a.setNombre("Ion");
        
        //System.out.println(a.getNombre());
        
        
        Libro l = new Libro();
        
        l.setTitulo("Los juegos del hambre");
        l.setISBN("32423-23423-423-42-3442");
        l.setPaginaActual(6);
        l.abrir();
        
        System.out.println(l);
        
        
        Libro l2 = new Libro();
        
        System.out.println(l2);
        
    }

}
