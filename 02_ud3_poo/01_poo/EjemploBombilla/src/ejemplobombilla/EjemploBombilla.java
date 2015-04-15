package ejemplobombilla;

public class EjemploBombilla {

    public static void main(String[] args) {

        // Escribe aquí...

        Bombilla b = null;
        
        b = new Bombilla(true);
        
        //Bombilla b = new Bomb

        
        //b.estado = false;
        
        b.encender();

        //System.out.println(b.estado);
        System.out.println(b.isEstado());
        
        b.apagar();
        System.out.println(b.isEstado());
        
        
    }

}
