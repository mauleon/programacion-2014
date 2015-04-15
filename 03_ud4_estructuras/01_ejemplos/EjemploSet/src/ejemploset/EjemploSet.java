package ejemploset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploSet {

    public static void main(String[] args) {

        Set<Persona> conjunto = new HashSet<>(); 
        
        Persona p1 = new Persona();
        p1.setNombre("Ion");
        p1.setApellidos("sdjhfdsf");
        Persona p2 = new Persona();
        p2.setNombre("Pepe");
        p2.setApellidos("jhghjgjhgjhgjhgjhghgjhgjhgjhgjh");
        Persona p3 = new Persona();
        p3.setApellidos("asgfahjdsgf");
        p3.setNombre("Luis");
        
        
        
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        
        conjunto.add(p1);

        
        Persona p = new Persona();
        p.setNombre("Ion");
        p.setApellidos("jhgjhghjgjhghhgjhgjhgjjghg");
        
        if( conjunto.contains(p) )
            System.out.println("SI");
        else
            System.out.println("NO");
    
        Iterator<Persona> iterador = conjunto.iterator();
        
        while( iterador.hasNext() )
        {
            Persona temp = iterador.next();
            
            System.out.println(temp);
        }
        
        
    }

}
