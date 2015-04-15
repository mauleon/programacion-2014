/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynew3enraya;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class ArrayNew3EnRaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tablero[][] = new int[3][3];
        boolean fin = true;
        boolean valido = false;
        int turno = 1;
        int columna = 0;
        int fila = 0;
        int ganador = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 8;
            }
        }

        System.out.println("\033[35mBienvenido al juego del tres en raya!!!\033[30m\n");
//lo primero mostramos tablero
        do {
            System.out.println(" \n\n");
            System.out.println("    1    2    3  ");
            for (int i = 0; i < 3; i++) {
                System.out.print((i+1)+" ");
                for (int j = 0; j < 3; j++) {
                    switch (tablero[i][j]) {
                        case 8:
                            System.out.print("| " + " " + " |");
                            break;
                        case 0:
                            System.out.print("| " + "O" + " |");
                            break;
                        case 1:
                            System.out.print("| " + "X" + " |");
                            break;

                        default:
                            System.out.println("ERROR!!");
                    }

                }
                System.out.println(" \n");
            }
            //luego se comprueba el turno para ver si se pone O o X
            if (turno % 2 != 0) {

                do {
                    try {

                        System.out.println("Jugador 1 introduce la FILA donde quieres poner la ficha:");
                        columna = (Integer.parseInt(br.readLine()) - 1);

                        System.out.println("Jugador 1 introduce la COLUMNA donde quieres poner la ficha:");
                        fila = (Integer.parseInt(br.readLine()) - 1);

                        if (tablero[columna][fila] != 8) {
                            System.out.println("La casilla que has insertado esta ocupada, elige otra!!!");
                            valido = true;
                        } else {

                            tablero[columna][fila] = 1;
                            valido = false;
                        }

                    } catch (Exception Ex) {
                        System.out.println("Has introducido una coordenada erronea, intentalo de nuevo!!");
                        valido = true;

                    }

                } while (valido);

            } else if (turno % 2 == 0) {

                do {
                    try {

                        System.out.println("Jugador 2 introduce la FILA donde quieres poner la ficha:");
                        columna = (Integer.parseInt(br.readLine()) - 1);

                        System.out.println("Jugador 2 introduce la COLUMNA donde quieres poner la ficha:");
                        fila = (Integer.parseInt(br.readLine()) - 1);

                        if (tablero[columna][fila] != 8) {
                            System.out.println("La casilla que has insertado esta ocupada, elige otra!!!");
                            valido = true;
                        } else {

                            tablero[columna][fila] = 0;
                            valido = false;
                        }
                    } catch (Exception Ex) {
                        System.out.println("Has introducido una coordenada erronea, intentalo de nuevo!!");
                        valido = true;
                    }
                } while (valido);

            }

            turno = turno + 1;
            if (turno == 10) {
                fin = false;
            }
            //se guarda en dos arrays de 3 la suma de las columnas y las filas
            int fil[] = new int[3];
            int col[] = new int[3];

            for (int i = 0; i < 3; i++) {
                fil[i] = fil[i] + tablero[0][i];
                fil[i] = fil[i] + tablero[1][i];
                fil[i] = fil[i] + tablero[2][i];

                col[i] = col[i] + tablero[i][0];
                col[i] = col[i] + tablero[i][1];
                col[i] = col[i] + tablero[i][2];

                //se comprueba si esa suma hace ganador ha alguien
                switch (fil[i]) {
                    case 0:
                        ganador = 0;
                        fin = false;
                        break;
                    case 3:
                        ganador = 1;
                        fin = false;
                        break;

                }

                switch (col[i]) {
                    case 0:
                        ganador = 0;
                        fin = false;
                        break;
                    case 3:
                        ganador = 1;
                        fin = false;
                        break;

                }
            }
            //comprobamos la primera diagonal
            if ((tablero[0][0] + tablero[1][1] + tablero[2][2]) == 0) {
                System.out.println("Ha sido diagonal!!!");
                ganador = 0;
                fin = false;
            } else if ((tablero[0][0] + tablero[1][1] + tablero[2][2]) == 3) {
                System.out.println("Ha sido diagonal!!!");
                ganador = 1;
                fin = false;
            }
            //comprobamos la segunda diagonal
            if ((tablero[2][0] + tablero[1][1] + tablero[0][2]) == 0) {
                System.out.println("Ha sido diagonal!!!");
                ganador = 0;
                fin = false;
            } else if ((tablero[0][0] + tablero[1][1] + tablero[2][2]) == 3) {
                System.out.println("Ha sido diagonal!!!");
                ganador = 1;
                fin = false;
            }

        } while (fin);

        System.out.println("FIN DEL JUEGO!!!!");

        if (ganador == 0) {
            System.out.println("\n\nHan ganado los O!!!!\nMUCHISSIMAS FELICIDADES!!!!");
        } else if (ganador == 1) {
            System.out.println("\n\nHan ganado las X!!!!\nMUCHISSIMAS FELICIDADES!!!!");
        }else{
            System.out.println("Habeis quedado en empate!!!");
        }

        System.out.println(" \n"); 
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tablero[i][j]) {
                    case 8:
                        System.out.print("| " + " " + "  |");
                        break;
                    case 0:
                        System.out.print("| " + "O" + "  |");
                        break;
                    case 1:
                        System.out.print("| " + "X" + "  |");
                        break;

                    default:
                        System.out.println("ERROR!!");
                }

            }
            System.out.println(" \n");

        }
        System.out.println("\033[35mGracias por jugar al maravilloso juego del tres en raya_____!!!\033[30m\n");
    }

}
