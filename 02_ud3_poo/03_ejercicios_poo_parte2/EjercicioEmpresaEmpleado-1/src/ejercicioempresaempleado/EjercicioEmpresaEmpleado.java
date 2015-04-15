package ejercicioempresaempleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioEmpresaEmpleado {

    public static void main(String[] args) throws IOException {

        // Escribe aquí...

        Empresa[] empresas = new Empresa[10];
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int numEmpresas = 0;
        
        int opcion = 0;
        
        do {
            System.out.println("1. Crear nueva empresa.\n" +
"2. Añadir empleado a empresa ya existente.\n" +
"3. Listado de empresas.\n" +
"4. Listado detallado de empresas y empleados.\n" +
"5. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(br.readLine());
            
            switch (opcion) {
                case 1:
                    // Nueva empresa
                    
                    
/*                    empresas[numEmpresas] = new Empresa();
                    System.out.print("Nombre de la empresa: ");
                    empresas[numEmpresas].setNombre(br.readLine());
                    numEmpresas++;*/

                    Empresa e = new Empresa();
                    System.out.println("Nombre de la empresa: ");
                    e.setNombre(br.readLine());
                    empresas[numEmpresas] = e;
                    numEmpresas++;
                    
                    break;
                case 3:
                    // Mostrar empresas
                    
/*                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println("Nombre: "+empresas[i].getNombre());
                        System.out.println("Año fundación: "+empresas[i].getAnyoFundacion());
                    }*/
                    
                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println(empresas[i]);
                    }
                    
                    break;
                    
                case 2:
                    
                    // Crear el empleado
                    Empleado em = new Empleado();
                    
                    System.out.print("Nombre: ");
                    em.setNombre(br.readLine());
                    System.out.print("Apellidos: ");
                    em.setApellidos(br.readLine());
                    
                    
                    // Pedir al usuario al usuario la empresa

                    for (int i = 0; i < numEmpresas; i++) {
                        System.out.println((i+1)+". "+empresas[i].getNombre());
                    }
                    
                    System.out.print("Elige empresa: ");
                    int numEmpresa = Integer.parseInt(br.readLine())-1;
                    
                    // Buscar un hueco en el array de empleados
                    int i=0;
                    while( i<100 && empresas[numEmpresa].getEmpleados()[i] != null )
                        i++;
                    
                    if( i<100 ) {
                        em.setEmpresa(empresas[numEmpresa]); // 2
                        empresas[numEmpresa].getEmpleados()[i] = em;  // 1
                    }
                    
                    break;
                    
                case 4:
                    for (int j = 0; j < numEmpresas; j++) {
                        System.out.println("Nombre: "+empresas[j].getNombre());
                        System.out.println("Año fundación: "+empresas[j].getAnyoFundacion());
                    
                        for (int k = 0; k < 100; k++) {
                            if( empresas[j].getEmpleados()[k] != null ) {
                                System.out.println("Nombre: "+empresas[j].getEmpleados()[k].getNombre());
                                System.out.println("Apellidos: "+empresas[j].getEmpleados()[k].getApellidos());
                            }
                        }
                    }
                    
                break;
                    
                default:
            }
            
            
        } while(opcion != 5);

    }

}
