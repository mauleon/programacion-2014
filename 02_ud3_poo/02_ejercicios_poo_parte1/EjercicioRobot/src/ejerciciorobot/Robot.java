package ejerciciorobot;

/**
 *
 * @author widemos
 */
public class Robot {
    
    private int x = 0;
    private int y = 0;
    
    public void mover( int x, int y ) {

        boolean ok = false;
        
        if( x == this.x+1 && y == this.y )
            ok = true;
        if( x == this.x && y == this.y+1 )
            ok = true;
        if( x == this.x-1 && y == this.y )
            ok = true;
        if( x == this.x && y == this.y-1 )
            ok = true;
        
        if(ok==true)
        {
            this.x = x;
            this.y = y;
            System.out.println("Nueva posición: ("+x+","+y+")");
        }
        else
            System.out.println("ERROR: Coordenadas no válidas...");
    }
    
}
