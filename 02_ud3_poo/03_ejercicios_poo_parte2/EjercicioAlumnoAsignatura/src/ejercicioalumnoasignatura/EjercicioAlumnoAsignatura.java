package ejercicioalumnoasignatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAlumnoAsignatura {

    // Constantes para definir el tamaño de los arrays de objetos
    public static final int MAX_ALUMNOS = 100;
    public static final int MAX_ASIGNATURAS = 100;

    public static void main(String[] args) throws IOException {

        // Arrays para almacenar los objetos
        Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
        Asignatura[] asignaturas = new Asignatura[MAX_ASIGNATURAS];

        // Un clásico
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Otro clásico
        int opcion;

        do {
            // Mostramos el menú
            System.out.println("1. Crear nuevo alumno.\n"
                    + "2. Crear nueva asignatura.\n"
                    + "3. Matricular alumno en asignatura.\n"
                    + "4. Listado de alumnos matriculados en una asignatura.\n"
                    + "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n"
                    + "6. Salir");

            // El usuario elige una opción
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(br.readLine());

            // Actuamos en consecuencia
            switch (opcion) {
                case 1: // Nuevo alumno

                    // Crear un objeto temporal y rellenarlo
                    Alumno tempAlumno = new Alumno();
                    System.out.print("  Nombre: ");
                    tempAlumno.setNombre(br.readLine());
                    System.out.print("  Apellidos: ");
                    tempAlumno.setApellidos(br.readLine());
                    System.out.print("  Email: ");
                    tempAlumno.setEmail(br.readLine());

                    // Buscar un hueco libre en el array de alumnos
                    int i = 0;
                    while (i < MAX_ALUMNOS && alumnos[i] != null) {
                        i++;
                    }

                    if (i < MAX_ALUMNOS) { // Hay hueco, nos hemos parado antes de llegar al final
                        // Copiamos la referencia en el array
                        alumnos[i] = tempAlumno;
                    } else {
                        System.out.println("ERROR: No se pueden añadir más alumnos...");
                    }

                    break;
                case 2: // Nueva asignatura

                    // Crear un objeto temporal y rellenarlo
                    Asignatura tempAsignatura = new Asignatura();
                    System.out.print("  Nombre: ");
                    tempAsignatura.setNombre(br.readLine());
                    System.out.print("  Horas semanales: ");
                    tempAsignatura.setHorasSemanales(Integer.parseInt(br.readLine()));

                    // Buscar un hueco libre en el array de asignaturas
                    i = 0;
                    while (i < MAX_ASIGNATURAS && asignaturas[i] != null) {
                        i++;
                    }

                    if (i < MAX_ASIGNATURAS) { // Hay hueco, nos hemos parado antes de llegar al final
                        // Copiamos la referencia en el array
                        asignaturas[i] = tempAsignatura;
                    } else {
                        System.out.println("ERROR: No se pueden añadir más asignaturas...");
                    }

                    break;
                case 3: // Matricular a alumno en asignatura (ya existente)

                    // Mostrar las asignaturas y elegir una
                    i = 0;
                    while (i < MAX_ASIGNATURAS && asignaturas[i] != null) {
                        System.out.println("  "+(i + 1) + ". " + asignaturas[i]);
                        i++;
                    }

                    // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                    System.out.print("Elige asignatura: ");
                    int eleccionAsignatura = Integer.parseInt(br.readLine()) - 1;

                    // Mostrar los alumnos y elegir uno
                    i = 0;
                    while (i < MAX_ALUMNOS && alumnos[i] != null) {
                        System.out.println("  "+(i + 1) + ". " + alumnos[i]);
                        i++;
                    }

                    // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                    System.out.print("Elige alumno: ");
                    int eleccionAlumno = Integer.parseInt(br.readLine()) - 1;

                    // Matricular al alumno en la asignatura
                    // Lado del alumno
                    // Buscar un hueco libre en el array de asignaturas del alumno
                    i = 0;
                    while (i < MAX_ASIGNATURAS && alumnos[eleccionAlumno].getAsignaturas()[i] != null) {
                        i++;
                    }

                    if (i < MAX_ASIGNATURAS) { // Hay hueco, nos hemos parado antes de llegar al final
                        // Copiamos la referencia en el array
                        alumnos[eleccionAlumno].getAsignaturas()[i] = asignaturas[eleccionAsignatura];
                    } else {
                        System.out.println("ERROR: Este alumno no se puede matricular en más asignaturas...");
                    }

                    // Lado de la asignatura
                    // Buscar un hueco libre en el array de alumnos de la asignatura
                    i = 0;
                    while (i < MAX_ALUMNOS && asignaturas[eleccionAsignatura].getAlumnos()[i] != null) {
                        i++;
                    }

                    if (i < MAX_ALUMNOS) { // Hay hueco, nos hemos parado antes de llegar al final
                        // Copiamos la referencia en el array
                        asignaturas[eleccionAsignatura].getAlumnos()[i] = alumnos[eleccionAlumno];
                    } else {
                        System.out.println("ERROR: En esta asignatura no se puede matricular nadie más...");
                    }

                    break;
                case 4: // Listado de alumnos matriculados en una asignatura
                    
                    // Mostrar las asignaturas y elegir una
                    i = 0;
                    while (i < MAX_ASIGNATURAS && asignaturas[i] != null) {
                        System.out.println("  "+(i + 1) + ". " + asignaturas[i]);
                        i++;
                    }

                    // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                    System.out.print("Elige asignatura: ");
                    eleccionAsignatura = Integer.parseInt(br.readLine()) - 1;
                    
                    // Mostrar los alumnos matriculados en la asignatura
                    i = 0;
                    while (i < MAX_ALUMNOS && asignaturas[eleccionAsignatura].getAlumnos()[i] != null) {
                        System.out.println("  "+asignaturas[eleccionAsignatura].getAlumnos()[i]);
                        i++;
                    }
                    

                    break;
                case 5: // Listado de asignaturas en las que está matriculado un alumno y total de horas

                    // Mostrar los alumnos y elegir uno
                    i = 0;
                    while (i < MAX_ALUMNOS && alumnos[i] != null) {
                        System.out.println("  "+(i + 1) + ". " + alumnos[i]);
                        i++;
                    }

                    // El usuario elige (le hemos mostrado los número de 1 a N) así que restamos 1
                    System.out.print("Elige alumno: ");
                    eleccionAlumno = Integer.parseInt(br.readLine()) - 1;
                    
                    // Mostrar las asignaturas en las que está matriculado y el total de horas
                    int totalHoras = 0;
                    
                    i = 0;
                    while (i < MAX_ASIGNATURAS && alumnos[eleccionAlumno].getAsignaturas()[i] != null) {
                        System.out.println("  "+alumnos[eleccionAlumno].getAsignaturas()[i]);
                        totalHoras += alumnos[eleccionAlumno].getAsignaturas()[i].getHorasSemanales();

                        i++;
                    }
                    
                    System.out.println("  El total de horas es: "+totalHoras);
                    
                    break;
                default:
                    break;
            }
        } while (opcion != 6);

    }

}
