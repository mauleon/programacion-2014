package ejerciciocuentabancaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuentaBancaria {

    // Constantes para definir el tamaño de los arrays de objetos
    public static final int MAX_TITULARES = 3;
    public static final int MAX_CUENTAS = 3;

    public static void main(String[] args) throws IOException {

        // Arrays para almacenar los objetos
        Titular[] titulares = new Titular[MAX_TITULARES];
        CuentaBancaria[] cuentas = new CuentaBancaria[MAX_CUENTAS];

        // Un clásico
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Otro clásico
        int opcion;

        // 3, 2, 1... 
        do {
            // Mostramos el menú
            System.out.println("1. Titular\n"
                    + "2. Cuenta bancaria\n"
                    + "3. Consultas\n"
                    + "4. Salir");

            // El usuario elige una opción
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            int otraOpcion; // Para los submenús

            // Actuamos en consecuencia
            switch (opcion) {
                case 1: // Submenú Titular

                    do {
                        // Mostramos el menú
                        System.out.println(
                                "  1. Nuevo titular\n"
                                + "  2. Salir");

                        // El usuario elige una opción
                        System.out.print("  Opción: ");
                        otraOpcion = Integer.parseInt(br.readLine());

                        // Actuamos en consecuencia
                        switch (otraOpcion) {
                            case 1: // Nuevo titular

                                // Crear el objeto y rellenarlo
                                Titular tempTitular = new Titular();
                                System.out.print("    Nombre: ");
                                tempTitular.setNombre(br.readLine());
                                System.out.print("    Apellidos: ");
                                tempTitular.setApellidos(br.readLine());
                                System.out.print("    DNI: ");
                                tempTitular.setDNI(br.readLine());
                                System.out.print("    Fecha de alta: ");
                                tempTitular.setFechaAlta(br.readLine());

                                // Buscar el primer hueco libre en el array 
                                int i = 0;
                                while (i < MAX_TITULARES && titulares[i] != null) {
                                    i++;
                                }

                                if (i < MAX_TITULARES) { // Hay hueco, nos hemos parado antes de llegar al final
                                    // Copiamos la referencia en el array
                                    titulares[i] = tempTitular;
                                } else {
                                    System.out.println("ERROR: No se pueden añadir más titulares...");
                                }

                                break;
                            default:
                                break;
                        }
                    } while (otraOpcion != 2);

                    break;
                case 2: // Submenú Cuenta Bancaria

                    do {
                        // Mostramos el menú
                        System.out.println(
                                "  1. Nueva cuenta\n"
                                + "  2. Nuevo apunte\n"
                                + "  3. Borrar cuenta\n"
                                + "  4. Salir");

                        // El usuario elige una opción
                        System.out.print("  Opción: ");
                        otraOpcion = Integer.parseInt(br.readLine());

                        // Actuamos en consecuencia
                        switch (otraOpcion) {
                            case 1: // Nueva cuenta
                                // Elegir el titular

                                // Mostrar los titulares y elegir uno
                                int i = 0;
                                while (i < MAX_TITULARES && titulares[i] != null) {
                                    System.out.println("    " + (i + 1) + ". " + titulares[i]);
                                    i++;
                                }

                                // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                                System.out.print("  Elige titular: ");
                                int eleccionTitular = Integer.parseInt(br.readLine()) - 1;

                                /* Crear la cuenta y añadirla al array
                                
                                 Aquí utilizamos el constructor que hemos creado para la ocasión. 
                                 La asociación ya tiene un sentido construído, el que va 
                                 de CuentaBancaria -> Titular
                                 */
                                CuentaBancaria tempCuenta = new CuentaBancaria(titulares[eleccionTitular]);

                                // Pedimos el código de cuenta
                                System.out.print("    Código de cuenta: ");
                                tempCuenta.setCodigoCuenta(br.readLine());

                                // Según el diagrama tiene que tener mínimo un apunte (1..*), así que lo creamos
                                tempCuenta.nuevoApunte(0); // También se podría pedir al usuario

                                // Conexión Titular -> CuentaBancaria
                                // Buscar un hueco libre en el array de de cuentas del titular
                                i = 0;
                                while (i < MAX_CUENTAS && titulares[eleccionTitular].getCuentas()[i] != null) {
                                    i++;
                                }

                                if (i < MAX_CUENTAS) { // Hay hueco, nos hemos parado antes de llegar al final
                                    // Copiamos la referencia en el array
                                    titulares[eleccionTitular].getCuentas()[i] = tempCuenta;
                                } else {
                                    System.out.println("ERROR: Este titular no puede tener más cuentas...");
                                }

                                // Añadir la cuenta al array de cuentas general
                                // Buscar el primer hueco libre en el array 
                                i = 0;
                                while (i < MAX_CUENTAS && cuentas[i] != null) {
                                    i++;
                                }

                                if (i < MAX_CUENTAS) { // Hay hueco, nos hemos parado antes de llegar al final
                                    // Copiamos la referencia en el array
                                    cuentas[i] = tempCuenta;
                                } else {
                                    System.out.println("ERROR: No se pueden añadir más cuentas...");
                                }

                                break;
                            case 2: // Nuevo apunte

                                // Mostrar las cuentas y elegir una (hay que usar un for porque puede haber huecos)
                                for (int j = 0; j < MAX_CUENTAS; j++) {
                                    if (cuentas[j] != null) {
                                        System.out.println("    " + (j + 1) + ". " + cuentas[j]);
                                    }
                                }

                                // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                                System.out.print("  Elige cuenta: ");
                                int eleccionCuenta = Integer.parseInt(br.readLine()) - 1;

                                // Crear un apunte en la cuenta seleccionada
                                System.out.print("    Cantidad a apuntar: ");
                                double cantidad = Double.parseDouble(br.readLine());

                                // Creamos el apunte usando el método específico
                                if (cuentas[eleccionCuenta].nuevoApunte(cantidad)) { // Devuelve true si todo va bien
                                    System.out.println("    INFO: Apunte creado...");
                                } else {
                                    System.out.println("    ERROR: No se ha podido crear el apunte...");
                                }

                                break;
                            case 3: // Borrar cuenta

                                // Mostrar las cuentas y elegir una (hay que usar un for porque puede haber huecos)
                                for (int j = 0; j < MAX_CUENTAS; j++) {
                                    if (cuentas[j] != null) {
                                        System.out.println("    " + (j + 1) + ". " + cuentas[j]);
                                    }
                                }

                                // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                                System.out.print("  Elige cuenta: ");
                                eleccionCuenta = Integer.parseInt(br.readLine()) - 1;

                                /*
                                 Para borrar un objeto tenemos que eliminar todas las referencias que 
                                 lo apuntan desde el programa.
                                
                                 https://www.evernote.com/l/AGIGcAtVI3FCVLprnAII1wP1i9_rJCDgWyA
                                 */
                                CuentaBancaria borrame = cuentas[eleccionCuenta]; // Para acortar las líneas

                                // Borrar la referencia a esta cuenta [1]
                                cuentas[eleccionCuenta] = null;

                                // Recorrer los titulares de la cuenta y borrar las referencias a esta cuenta [2]
                                for (int j = 0; j < MAX_TITULARES; j++) { // Puede haber huecos libres, no sirve el while
                                    for (int k = 0; k < MAX_CUENTAS; k++) { // Por cada titular hay que pasar por su array de cuentas
                                        if (borrame.getTitulares()[j] != null) {
                                            if (borrame.getTitulares()[j].getCuentas()[k] == borrame) {
                                                borrame.getTitulares()[j].getCuentas()[k] = null; // Anulamos la referencia y el hueco queda libre
                                            }
                                        }
                                    }
                                }

                                // Recorrer los apuntes de la cuenta y borrar sus referencias a esta cuenta [3]
                                // No es necesario, el recolector de basura hace correctamente el trabajo
                                ; // Para que el formato automático no elimine la línea en blanco de debajo :)

                                // Borrar la referencia temporal [4]
                                borrame = null;

                                // Llamada explícita al recolector de basura para verlo en acción
                                System.gc();

                                break;
                            default:
                                break;
                        }
                    } while (otraOpcion != 4);

                    break;
                case 3: // Consultas

                    do {
                        // Mostramos el menú
                        System.out.println(
                                "  1. Dado un titular, saldo de todas sus cuentas\n"
                                + "  2. Dada una cuenta, titulares asociados\n"
                                + "  3. Salir");

                        // El usuario elige una opción
                        System.out.print("  Opción: ");
                        otraOpcion = Integer.parseInt(br.readLine());

                        // Actuamos en consecuencia
                        switch (otraOpcion) {
                            case 1: // Dado un titular, saldo de todas sus cuentas

                                // Mostrar los titulares y elegir uno
                                int i = 0;
                                while (i < MAX_TITULARES && titulares[i] != null) {
                                    System.out.println("    " + (i + 1) + ". " + titulares[i]);
                                    i++;
                                }

                                // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                                System.out.print("  Elige titular: ");
                                int eleccionTitular = Integer.parseInt(br.readLine()) - 1;

                                // Recorrer las cuentas de ese titular y mostrar el saldo
                                for (int j = 0; j < MAX_CUENTAS; j++) {
                                    if (titulares[eleccionTitular].getCuentas()[j] != null) {
                                        System.out.println("    " + titulares[eleccionTitular].getCuentas()[j] + ", saldo: " + titulares[eleccionTitular].getCuentas()[j].calcularSaldo());
                                    }
                                }

                                break;
                            case 2: // Dada una cuenta, titulares asociados

                                // Mostrar las cuentas y elegir una (hay que usar un for porque puede haber huecos)
                                for (int j = 0; j < MAX_CUENTAS; j++) {
                                    if (cuentas[j] != null) {
                                        System.out.println("    " + (j + 1) + ". " + cuentas[j]);
                                    }
                                }

                                // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                                System.out.print("  Elige cuenta: ");
                                int eleccionCuenta = Integer.parseInt(br.readLine()) - 1;

                                // Recorrer los titulares de la cuenta y mostrarlos
                                for (int j = 0; j < MAX_TITULARES; j++) { // Puede haber huecos libres, no sirve el while
                                    if (cuentas[eleccionCuenta].getTitulares()[j] != null) {
                                        System.out.println("    " + cuentas[eleccionCuenta].getTitulares()[j]);
                                    }
                                }

                                break;
                            default:
                                break;
                        }
                    } while (otraOpcion != 3);

                    break;
                default:
                    break;
            }
        } while (opcion != 4);

    }

}
