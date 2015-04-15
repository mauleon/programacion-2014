package ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioOperaciones {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Dos números enteros
        System.out.print("Escribe un número entero: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.print("Escribe otro número entero: ");
        String s = br.readLine();
        int n2 = Integer.parseInt(s);

        System.out.println("n1 + n2 = " + (n1 + n2));

        int r = n1 - n2;
        System.out.println("n1 - n2 = " + r);

        System.out.println("n2 - n1 = " + (n2 - n1));
        System.out.println("n1 * n2 = " + (n1 * n2));
        System.out.println("n1 / n2 = " + (n1 / n2));
        System.out.println("n2 / n1 = " + (n2 / n1));
        System.out.println("n1 % n2 = " + (n1 % n2));
        System.out.println("n2 % n1 = " + (n2 % n1));

        // Dos números reales
        System.out.print("Escribe un número real: ");
        double r1 = Double.parseDouble(br.readLine());

        System.out.print("Escribe otro número real: ");
        double r2 = Double.parseDouble(br.readLine());

        System.out.println("r1 + r2 = " + (r1 + r2));
        System.out.println("r1 - r2 = " + (r1 - r2));
        System.out.println("r2 - r1 = " + (r2 - r1));
        System.out.println("r1 * r2 = " + (r1 * r2));
        System.out.println("r1 / r2 = " + (r1 / r2));
        System.out.println("r2 / r1 = " + (r2 / r1));
        System.out.println("r1 % r2 = " + (r1 % r2));
        System.out.println("r2 % r1 = " + (r2 % r1));

        // Entero y real
        System.out.println("n1 + r1 = " + (n1 + r1));
        //System.out.println(n1+" + "+r1+" = "+(n1+r1));
        System.out.println("n1 - r1 = " + (n1 - r1));
        System.out.println("r1 - n1 = " + (r1 - n1));
        System.out.println("n1 * r1 = " + (n1 * r1));
        System.out.println("n1 / r1 = " + (n1 / r1));
        System.out.println("r1 / n1 = " + (r1 / n1));
        System.out.println("n1 % r1 = " + (n1 % r1));
        System.out.println("r1 % n1 = " + (r1 % n1));

    }

}
