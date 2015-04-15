package ejerciciotresenraya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTresEnRaya {

    static void mostrarTablero(int[][] t) {
        System.out.println("   A  B  C ");
        for (int f = 0; f < 3; f++) {
            System.out.print((f + 1) + " ");
            for (int c = 1; c < 4; c++) {
                switch (t[f][c]) {
                    case 0:
                        System.out.print(" O ");
                        break;
                    case 1:
                        System.out.print(" X ");
                        break;
                    case 5:
                        System.out.print(" . ");
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        // Crear el tablero
        int[][] t = new int[4][5];

        // Recorrido e inicialización
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                t[i][j] = 5;
            }
        }

        int turno = 1;  // Empieza jugando el jugador 1

        int fila = 0;   // Pedir los datos
        int columna = 0;

        int tiradas = 0;  // Número de tiradas

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ganador = 0; // ¿Hay ganador? (Y quien es...)

        mostrarTablero(t);

        do {
            System.out.println("Jugador: " + turno);

            System.out.print("Escribe la columna (A|B|C): ");
            String s = br.readLine().toUpperCase();
            switch (s) {
                case "A":
                    columna = 1;
                    break;
                case "B":
                    columna = 2;
                    break;
                case "C":
                    columna = 3;
                    break;
                default:
            }

            System.out.print("Escribe la fila (1|2|3): ");
            fila = Integer.parseInt(br.readLine());

            if (t[fila - 1][columna] == 5) {  // La celda está vacia
                
                // Modificar el tablero
                if (turno == 1) {
                    t[fila - 1][columna] = 0;
                } else {
                    t[fila - 1][columna] = 1;
                }

                // Cambiar el turno
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }

                // Suma horizontal
                for (int i = 0; i < 3; i++) {
                    t[i][4] = 0;
                    for (int j = 1; j < 4; j++) {
                        t[i][4] += t[i][j];
                    }
                }

                // Suma vertical
                for (int j = 1; j < 4; j++) {
                    t[3][j] = 0;
                    for (int i = 0; i < 3; i++) {
                        t[3][j] += t[i][j];
                    }
                }

                // Diagonales
                t[3][0] = t[2][1] + t[1][2] + t[0][3];
                t[3][4] = t[2][3] + t[1][2] + t[0][1];

                // Comprobar si hay ganador
                for (int i = 0; i < 5; i++) {
                    if (t[3][i] == 0) {
                        ganador = 1;
                    } else if (t[3][i] == 3) {
                        ganador = 2;
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (t[i][4] == 0) {
                        ganador = 1;
                    } else if (t[i][4] == 3) {
                        ganador = 2;
                    }
                }

                // Felicitar al ganador
                if (ganador > 0) {
                    System.out.println("Ha ganado el jugador: " + ganador);
                }

                tiradas++;
                
                mostrarTablero(t);
                
            } else {
                System.out.println("ERROR: La casilla está ocupada...");
            }

        } while (ganador == 0 && tiradas < 9);
        
        if( ganador == 0 )
            System.out.println("¡Empate!");

    }

}
