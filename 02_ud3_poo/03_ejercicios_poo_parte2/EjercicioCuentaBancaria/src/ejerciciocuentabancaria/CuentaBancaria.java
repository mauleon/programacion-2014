package ejerciciocuentabancaria;

import java.time.LocalDateTime;

/**
 *
 * @author widemos
 */
public class CuentaBancaria {

    // Propiedades
    private String codigoCuenta = null;

    // Asociación con Apunte (este es el lado N)
    private static final int MAX_APUNTES = 100; // Constante para definir el array
    private Apunte[] apuntes = null;

    // Asociación N:M con Titular 
    private Titular[] titulares = null;

    // Constructor
    public CuentaBancaria(Titular primerTitular) {
        // MODIFICACION: La única manera de crear una cuenta es pasándole el primer titular
        apuntes = new Apunte[MAX_APUNTES];
        titulares = new Titular[EjercicioCuentaBancaria.MAX_TITULARES];

        // Acabamos de crear la cuenta, así que no hay que molestarse en buscar
        titulares[0] = primerTitular;

        /*
         NOTA: Como no existe el constructor CuentaBancaria() no se puede 
         hacer new CuentaBancaria() sin pasar un Titular con lo que garantizamos 
         que cuando se cree una cuenta tiene que tener titular (salvo que nos 
         pasen null en cuyo caso habría que generar una excepción)
        
         http://stackoverflow.com/questions/9965300/can-the-constructor-abort-instantiation
         
         */
    }

    // Métodos definidos por el diseñador de la aplicación
    public double calcularSaldo() { // Recorrer el array de apuntes y sumar el total

        double total = 0;

        // Recorrer y sumar
        int i = 0;
        while (i < MAX_APUNTES && apuntes[i] != null) {
            total += apuntes[i].getCantidad();

            i++;
        }

        return total;
    }

    public boolean nuevoApunte(double cantidad) { // Crear un nuevo apunte
        // MODIFICADO: Devuelve un boolean para decir si ha ido bien o no
        boolean OK = false;

        // Creamos el objeto y lo rellenamos con los datos
        Apunte tempApunte = new Apunte();
        tempApunte.setCantidad(cantidad);
        tempApunte.setFecha(LocalDateTime.now().toString()); // Fecha y hora actual

        // Buscar un hueco libre en el array 
        int i = 0;
        while (i < MAX_APUNTES && apuntes[i] != null) {
            i++;
        }

        if (i < MAX_APUNTES) { // Hay hueco, nos hemos parado antes de llegar al final

            // Construimos la asociación
            apuntes[i] = tempApunte; // Cuenta -> Apunte
            apuntes[i].setCuenta(this); // Apunte -> Cuenta

            OK = true; // Todo ha ido bien
        }

        return OK;
    }

    // Método toString()
    @Override
    public String toString() {
        return "CuentaBancaria{" + "codigoCuenta=" + codigoCuenta + '}';
    }

    // Métodos de acceso
    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public Titular[] getTitulares() { // No generamos el setTitulares()
        return titulares;
    }

    // Experimento para hacer visible la destrucción del objeto
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.err.println("      INFO: Borrando " + this);
    }

}
