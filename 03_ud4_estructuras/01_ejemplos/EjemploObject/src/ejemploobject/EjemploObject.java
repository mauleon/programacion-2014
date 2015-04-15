package ejemploobject;

import java.util.Random;

public class EjemploObject {

    public static void main(String[] args) {

        Box b1 = new Box();
        
        b1.setContenido("Julio");
        
        Box b2 = new Box();
        
        b2.setContenido( new Random() );
     
        
        
        Box b3 = new Box();

        Alumno a = new Alumno();
        a.setNombre("Dani");
        
        b3.setContenido( a );
        
        Alumno convertido = (Alumno)b3.getContenido();
        
        System.out.println("Nombre: "+a.getNombre());
        System.out.println("Nombre: "+convertido.getNombre());
        
        
        Caja<Alumno> c1 = new Caja<>();
        
        c1.setContenido(a);
        
        System.out.println("Nombre: "+c1.getContenido().getNombre());

        Caja<String> c2 = new Caja<>();
        
        c2.setContenido("Hola");
        
        System.out.println("Contenido de la caja misteriosa: "+c1.getContenido());
    
    }

}
