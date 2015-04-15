package jugueteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Jugueteria {

    public static void main(String[] args) throws IOException {

        //Escribe aquí...
        List<Tienda> tiendas = new LinkedList<>();
        List<Juguete> juguetes = new LinkedList<>();
        List<Comprador> compradores = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("1. Gestión de tiendas\n"
                    + "     11. Nueva tienda\n"
                    + "     12. Baja de tienda\n"
                    + "2. Gestión de juguetes\n"
                    + "     21. Nuevo juguete (asociado a una tienda)\n"
                    + "     22. Modificar stock de un juguete\n"
                    + "3. Gestión de compras\n"
                    + "     31. Nuevo comprador\n"
                    + "     32. Baja de comprador\n"
                    + "     33. Realizar compra (asociar comprador y juguete)\n"
                    + "4. Consultas\n"
                    + "     41. Mostrar todas las compras de un comprador concreto\n"
                    + "     42. Mostrar los productos de una tienda con stock menor que 5 unidades\n"
                    + "     43. Mostrar los juguetes comprados en una tienda, incluyendo datos del comprador\n"
                    + "5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 11:
                    //Nueva tienda

                    System.out.println("NUEVA TIENDA");
                    Tienda t = new Tienda();

                    System.out.print("Nombre: ");
                    t.setNombre(br.readLine());
                    System.out.print("Ciudad: ");
                    t.setCiudad(br.readLine());

                    tiendas.add(t);
                    break;

                case 12:
                    //Baja de tienda

                    
                    System.out.println("BORRAR TIENDA");

                    for (int i = 0; i < tiendas.size(); i++) {
                        System.out.println((i + 1) + ". " + tiendas.get(i));
                    }
                    System.out.print("Elige: ");
                    int eleccion = Integer.parseInt(br.readLine()) - 1;

                    tiendas.remove(eleccion);
                    //tiendas.remove ?

                    /*
                     int i = 0;
            
                     for (Tienda tienda : tiendas) {
                     System.out.println((i+1)+". "+tienda);
                     i++;
                     }
                     */
                    break;

                case 21:

                    System.out.println("NUEVO JUGUETE");

                    for (int i = 0; i < tiendas.size(); i++) {
                        System.out.println((i + 1) + ". " + tiendas.get(i));
                    }
                    System.out.print("Elige: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    Juguete j = new Juguete();
                    System.out.print("Nombre: ");
                    j.setNombre(br.readLine());
                    System.out.print("Descripción :");
                    j.setDescripcion(br.readLine());
                    System.out.print("Precio: ");
                    j.setPrecio(Double.parseDouble(br.readLine()));
                    System.out.print("Stock: ");
                    j.setStock(Integer.parseInt(br.readLine()));

                    juguetes.add(j);

                    //asociar juguete a la tienda
                    j.getJtiendas().add(tiendas.get(eleccion));
                    tiendas.get(eleccion).getTjuguetes().add(j);

                    break;

                case 22:

                    System.out.println("MODIFICAR STOCK DE UN JUGUETE");

                    System.out.print("Juguetes: ");

                    int i = 0;

                    for (Juguete juguete : juguetes) {
                        System.out.println((i + 1) + ". " + juguete);
                        i++;
                    }
                    System.out.println("Elige: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    System.out.println("Juguete: " + juguetes.get(eleccion));
                    System.out.println("Nuevo stock: ");
                    juguetes.get(eleccion).setStock(
                            Integer.parseInt(br.readLine())
                    );

                    break;

                case 31:

                    System.out.println("NUEVO COMPRADOR");

                    Comprador c = new Comprador();

                    System.out.print("Nombre: ");
                    c.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    c.setApellidos(br.readLine());
                    System.out.print("Email: ");
                    c.setEmail(br.readLine());

                    compradores.add(c);

                    break;

                case 32:

                    System.out.println("BAJA DE COMPRADOR");
                    System.out.println("Compradores: ");

                    i = 0;
                    for (Comprador comprador : compradores) {

                        System.out.println((i + 1) + ". " + compradores);
                        i++;
                    }

                    System.out.print("Elige: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    compradores.remove(eleccion);
                    break;

                case 33:

                    System.out.println("REALIZAR COMPRA");

                    i = 0;
                    for (Comprador comprador : compradores) {
                        System.out.println((i + 1) + ". " + compradores);
                    }
                    System.out.print("Elige comprador: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    i = 0;
                    for (Juguete juguete : juguetes) {

                        System.out.print((i + 1) + ". " + juguetes);

                    }
                    System.out.println("Elige juguete: ");
                    int eleccion2 = Integer.parseInt(br.readLine()) - 1;

                    Juguete tempJ = juguetes.get(eleccion2);

                    System.out.print("Dime cuantos quieres: ");
                    int cantidadComprada = Integer.parseInt(br.readLine());

                    if (tempJ.getStock() >= cantidadComprada) {
                        int variacionStock = tempJ.getStock() - cantidadComprada;
                        tempJ.setStock(variacionStock);

                        Comprador tempC = compradores.get(eleccion);

                        tempJ.getJcompradores().add(tempC);
                        tempC.getCjuguetes().add(tempJ);

                    } else {
                        System.out.println("ERROR: Lo sentimos, no hay suficientes...");
                    }

                    break;

                case 41:
                    // Mostrar todas las compras de un comprador concreto

                    System.out.println("LISTADO DE COMPRAS");

                    i = 0;
                    for (Comprador comprador : compradores) {
                        System.out.println((i + 1) + ". " + compradores);
                    }
                    System.out.print("Elige comprador: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    for (Juguete jj : compradores.get(eleccion).getCjuguetes()) {
                        System.out.println(jj);
                    }

                    break;

                case 42:

                    // Mostrar los productos de una tienda con stock menor que 5 unidades
                    System.out.println("STOCK < 5");

                    for (i = 0; i < tiendas.size(); i++) {
                        System.out.println((i + 1) + ". " + tiendas.get(i));
                    }
                    System.out.print("Elige: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    for (Juguete jj : tiendas.get(eleccion).getTjuguetes()) {
                        if (jj.getStock() < 5) {
                            System.out.println(jj);
                        }
                    }

                    break;

                case 43:
                    // Mostrar los juguetes comprados en una tienda, incluyendo datos del comprador

                    System.out.println("TODOS LOS JUGUETES CON COMPRADOR");

                    for (i = 0; i < tiendas.size(); i++) {
                        System.out.println((i + 1) + ". " + tiendas.get(i));
                    }
                    System.out.print("Elige: ");
                    eleccion = Integer.parseInt(br.readLine()) - 1;

                    for (Juguete jj : tiendas.get(eleccion).getTjuguetes()) {
                        if (jj.getJcompradores().size() > 0) {
                            System.out.println(jj);
                            for (Comprador cc : jj.getJcompradores()) {
                                System.out.println(cc);
                            }
                        }
                    }

                    break;

                default:
            }

        } while (opcion != 5);

    }

}
