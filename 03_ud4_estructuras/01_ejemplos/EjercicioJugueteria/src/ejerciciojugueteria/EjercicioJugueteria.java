package ejerciciojugueteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EjercicioJugueteria {

    public static void main(String[] args) throws IOException {

//        List<Tienda> tiendas = new LinkedList<>();
        List<Tienda> tiendas = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;

        do {

            System.out.println("1. Gestión de tiendas\n"
                    + "  1. Nueva tienda\n"
                    + "  2. Baja de tienda\n"
                    + "2. Gestión de juguetes\n"
                    + "  1. Nuevo juguete (asociado a una tienda)\n"
                    + "  2. Modificar stock de un juguete\n"
                    + "3. Gestión de compras\n"
                    + "  1. Nuevo comprador\n"
                    + "  2. Baja de comprador\n"
                    + "  3. Realizar compra (asociar comprador y juguete)\n"
                    + "4. Consultas\n"
                    + "  1. Mostrar todas las compras de un comprador concreto\n"
                    + "  2. Mostrar los productos de una tienda con stock menor que 5 unidades\n"
                    + "  3. Mostrar los juguetes comprados en una tienda, incluyendo datos del comprador\n"
                    + "5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 11:
                    // Nueva tienda

                    Tienda t = new Tienda();

                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());
                    System.out.print("Ciudad: ");
                    t.setCiudad(br.readLine());

                    tiendas.add(t);

                    break;
                case 12:
                    // Baja de tienda

                    for (int i = 0; i < tiendas.size(); i++) {
                        System.out.println((i + 1) + ". " + tiendas.get(i));
                    }

                    System.out.print("Elige: ");
                    int eleccion = Integer.parseInt(br.readLine()) - 1;

                    tiendas.remove(eleccion);

                    break;
                default:
            }

        } while (opcion != 5);

    }

}
