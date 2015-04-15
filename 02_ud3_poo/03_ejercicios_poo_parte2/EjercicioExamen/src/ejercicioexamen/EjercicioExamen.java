package ejercicioexamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioExamen {

    public static final int MAX_CLIENTES = 100;
    public static final int MAX_REPARACIONES = 100;

    public static void main(String[] args) throws IOException {

        Cliente[] clientes = new Cliente[MAX_CLIENTES];
        Reparacion[] reparaciones = new Reparacion[MAX_REPARACIONES];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        do {
            System.out.println("1. Nuevo cliente\n"
                    + "2. Nueva reparación\n"
                    + "3. Mis reparaciones\n"
                    + "4. Todas las reparaciones\n"
                    + "5. Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: // Nuevo cliente

                    // Crear el objeto
                    Cliente c = new Cliente();

                    // Rellenar el objeto
                    System.out.print("Nombre: ");
                    c.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    c.setApellidos(br.readLine());
                    System.out.print("DNI: ");
                    c.setDNI(br.readLine());
                    System.out.print("Email: ");
                    c.setEmail(br.readLine());

                    // Buscar sitio en el array
                    int i = 0;
                    while (i < MAX_CLIENTES && clientes[i] != null) {
                        i++;
                    }

                    if (i < MAX_CLIENTES) {
                        // Hay sitio
                        // Guardar el objeto
                        clientes[i] = c;
                    } else {
                        System.out.println("ERROR: No queda sitio para más clientes...");
                    }

                    break;
                case 2: // Nueva reparación

                    // Mostrar los clientes
                    i = 0;
                    while (i < MAX_CLIENTES && clientes[i] != null) {
                        System.out.println((i + 1) + ". " + clientes[i]);
                        i++;
                    }

                    // Elegir uno
                    System.out.print("Elige un cliente:");
                    int eleccion = Integer.parseInt(br.readLine()) - 1;

                    // Crear la reparación
                    Reparacion r = new Reparacion();

                    System.out.print("Descripción: ");
                    r.setDescripcion(br.readLine());
                    System.out.print("Coste: ");
                    r.setCoste(Double.parseDouble(br.readLine()));
                    System.out.print("Pagado (s/n): ");
                    String cadena = br.readLine();
                    if (cadena.equalsIgnoreCase("s")) {
                        r.setPagado(true);
                    }

                    // Asociar cliente y reparación
                    
                    // Buscar sitio en el array
                    i = 0;
                    while (i < MAX_REPARACIONES && clientes[eleccion].getReparaciones()[i] != null) {
                        i++;
                    }

                    if (i < MAX_REPARACIONES) {
                        clientes[eleccion].getReparaciones()[i] = r; // Cliente -> Reparacion [1]
                        r.setCliente(clientes[eleccion]);  // Reparacion -> Cliente
                    } else {
                        System.out.println("ERROR: No queda sitio para más reparaciones...");
                    }
                    
                    // Añadir la reparación al array de reparaciones general (el del main)
                    
                    break;
                case 3: // Mis reparaciones
                    
                    // Mostrar los clientes
                    i = 0;
                    while (i < MAX_CLIENTES && clientes[i] != null) {
                        System.out.println((i + 1) + ". " + clientes[i]);
                        i++;
                    }

                    // Elegir uno
                    System.out.print("Elige un cliente:");
                    eleccion = Integer.parseInt(br.readLine()) - 1;
                    
                    // Mostrar las reparaciones de ese cliente
                    clientes[eleccion].misReparaciones();
                    
                    break;
                case 4: // Todas las reparaciones

                    // Recorrer todos los clientes
                    i = 0;
                    while (i < MAX_CLIENTES && clientes[i] != null) {

                        // Por cada cliente, mostrar sus reparaciones
                        clientes[i].misReparaciones();
                        System.out.println("  "+clientes[i]);
                        
                        i++;
                    }

                    break;
                default:
                    break;
            }

        } while (opcion != 5);
    }

}
