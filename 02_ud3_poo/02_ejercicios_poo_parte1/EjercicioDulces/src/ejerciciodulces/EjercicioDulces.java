package ejerciciodulces;

public class EjercicioDulces {

    public static void main(String[] args) {


        Dulce d = new Dulce();
        d.setCalorias(100);
        d.setPeso(1000);
        d.comer(300);
        
        Chocolate c = new Chocolate();
        c.setCalorias(100);
        c.setPeso(1000);
        c.comer(200);
        c.setBlanco(true);
        
        Tableta t = new Tableta();
        t.setCalorias(100);
        t.setPeso(1000);
        t.comer(200);
        t.setBlanco(true);

        Tarta tt = new Tarta();
        tt.setCalorias(100);
        tt.setPeso(1000);
        tt.comer(500);
        tt.setBlanco(true);
        tt.lanzar("Ion");
        
        Chocolate cc = new Tarta();
        
    }

}
