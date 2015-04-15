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
                default:
            }
            
            
        } while(opcion != 5);

    }

}
