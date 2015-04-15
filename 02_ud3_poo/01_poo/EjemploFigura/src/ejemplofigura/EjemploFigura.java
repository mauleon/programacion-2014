package ejemplofigura;

public class EjemploFigura {

    public static void main(String[] args) {

        Figura f = new Figura();
        f.setColor(125);
        f.dibujar();
        
        Triangulo t = new Triangulo();
        t.setColor(45);
        t.dibujar();
        
        Circulo c = new Circulo();
        c.setColor(72);
        c.dibujar();
        
        Circulo c2 = new Circulo();
        c2.setColor(33);
        c2.dibujar();
        
    }

}
