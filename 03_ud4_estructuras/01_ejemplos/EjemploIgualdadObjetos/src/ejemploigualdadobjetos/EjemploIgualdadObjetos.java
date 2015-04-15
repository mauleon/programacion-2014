package ejemploigualdadobjetos;

public class EjemploIgualdadObjetos {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Ion");
        p.setApellidos("Jaureguialzo Sarasola");
        p.setDNI("123456789");

        Persona r = new Persona();
        r.setNombre("Ion");
        r.setApellidos("Jaureguialzo Sarasola");
        r.setDNI("123456789");

        if (p == r) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }

        if (p.equals(r)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Distintos");
        }

        p.setNombre("Iom");
        System.out.println(p.hashCode());
        System.out.println(r.hashCode());
        
    }

}
