package ejerciciolibroinfantil;

public class EjercicioLibroInfantil {

    public static void main(String[] args) {

        // Escribe aquí...

        Libro l = new Libro();
        l.abrir();
        l.setTitulo("El Quijote");
        l.setNumPaginas(1000);
        l.setPaginaActual(30);
        
        LibroInfantil li = new LibroInfantil();
        li.abrir();
        li.setTitulo("Caperucita Roja");
        li.setPaginaActual(1);
        li.setNumPaginas(20);
        
        li.setEdadRecomendada(3);
        
        if( li.esRecomendable(5) )
            System.out.println("El libro es recomendable");
        else
            System.out.println("El libro NO es recomendable");
        
        
    }

}
