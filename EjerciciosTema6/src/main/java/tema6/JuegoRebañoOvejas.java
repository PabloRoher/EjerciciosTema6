package tema6;

import java.util.Arrays;
import java.util.Scanner;

public class JuegoRebañoOvejas {

    char[] tablero = new char[7];

    public JuegoRebañoOvejas() {
        for (int i = 0; i < tablero.length; i++) {
            if (i < 3) {
                tablero[i] = ">".charAt(0);
            } else if (i == 3) {
                tablero[i] = " ".charAt(0);
            } else {
                tablero[i] = "<".charAt(0);
            }

        }

    }
    public boolean moverOvejas(char[] tablero, int peon){
        if (tablero[peon] == ">".charAt(0)){
            if (tablero[peon + 1] == " ".charAt(0)){
                tablero[peon + 1] = ">".charAt(0);
                tablero[peon] = " ".charAt(0);
                return true;
            }else if (tablero[peon + 1] == "<".charAt(0) && tablero[peon + 2] == " ".charAt(0)){
                tablero[peon + 2] = ">".charAt(0);
                tablero[peon] = " ".charAt(0);
                return true;
            }else {
                System.out.println("No puedes mover ese peon");
                return false;
            }
        }else if (tablero[peon] == "<".charAt(0)){
            if (tablero[peon - 1] == " ".charAt(0)){
                tablero[peon - 1] = "<".charAt(0);
                tablero[peon] = " ".charAt(0);
                return true;
            }else if (tablero[peon - 1] == ">".charAt(0) && tablero[peon - 2] == " ".charAt(0)){
                tablero[peon - 2] = "<".charAt(0);
                tablero[peon] = " ".charAt(0);
                return true;
            }else {
                System.out.println("No puedes mover ese peon");
                return false;
            }
        }else {
            System.out.println("No puedes mover ese peon");
            return false;
        }
    }

    public boolean comprobarVictoria(char[] tablero){
        char[] tableroVictoria = new char[7];
        if (tablero.toString().equals(tableroVictoria.toString())){
            return true;
        }else {
            return false;
        }
    }
    public void mostrarTablero(char[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "tablero=" + Arrays.toString(tablero) + '}';
    }



    public static void main(String[] args) {
        JuegoRebañoOvejas juego = new JuegoRebañoOvejas();
        JuegoRebañoOvejas juego2 = new JuegoRebañoOvejas();
        juego.mostrarTablero(juego.tablero);

        System.out.println("Que peon quieres mover?");
        Scanner sc = new Scanner(System.in);
        int peon = sc.nextInt();

        while (true){
            juego2.tablero = juego.tablero;
            juego.moverOvejas(juego.tablero, peon);
            juego.mostrarTablero(juego.tablero);
            System.out.println("Que peon quieres mover?");
            peon = sc.nextInt();
            if (juego.comprobarVictoria(juego.tablero)){
                System.out.println("Has ganado");
                break;
            }

        }
    }

}