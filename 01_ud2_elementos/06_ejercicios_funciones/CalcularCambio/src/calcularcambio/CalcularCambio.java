package calcularcambio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcularCambio {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Cantidad a convertir (en euros): ");
        double euros = Double.parseDouble(br.readLine());

        System.out.print("Moneda a la que convertir (USD,GBP,JPY,CNY): ");
        String moneda = br.readLine();

        double R = calcularCambio(euros, moneda);
        if ( R != -1 ) {
            System.out.println("El valor convertido es: " + R + " " + moneda);
        } else {
            System.out.println("ERROR: No se ha podido hacer la conversión.");
        }
    }

    static double calcularCambio(double cantidad, String monedaDestino) {

        double conversion = -1;

        switch (monedaDestino) {
            case "USD":
                conversion = cantidad * 1.28;
                break;
            case "GBP":
                conversion = cantidad * 0.8;
                break;
            case "JPY":
                conversion = cantidad * 7.81;
                break;
            case "CNY":
                conversion = cantidad * 135.35;
                break;
            default:
        }

        return conversion;
    }
}
