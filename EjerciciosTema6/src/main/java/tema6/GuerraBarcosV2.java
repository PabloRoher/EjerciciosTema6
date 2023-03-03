package tema6;

import java.util.Random;
import java.util.Scanner;

public class GuerraBarcosV2 {

    Random random = new Random();

    int filaBarco = random.nextInt(3);
    int columnaBarco = random.nextInt(3);



    public char[][] crearTablero(int filas, int columnas){
        char[][] tablero = new char[filas][columnas];
        return tablero;
    }

    public void mostrarTablero(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void inicializarTablero(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "?".charAt(0);
            }
        }
    }

    public void introducirEnteroEntreLimites(int max, int min){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre " + min + " y " + max + ":");
        int numero = sc.nextInt();

    }

    public boolean dispara(char[][] tablero, int fila, int columna){
        if (fila == filaBarco && columna == columnaBarco){
            System.out.println("Tocado y hundido");
            return true;
        }else{
            tablero[fila][columna] = "-".charAt(0);
            System.out.println("Agua");
            return false;
        }
    }



    public static void main(String[] args){
        GuerraBarcosV2 juego = new GuerraBarcosV2();
        char[][] tablero = juego.crearTablero(4,4);
        juego.inicializarTablero(tablero);
        juego.mostrarTablero(tablero);

        System.out.println("--------------------");
        while (true){
            System.out.println("Introduce la fila:");
            Scanner sc = new Scanner(System.in);
            int fila = sc.nextInt() - 1;
            System.out.println("Introduce la columna:");
            int columna = sc.nextInt() - 1;
            if (juego.dispara(tablero, fila, columna)){
                break;
            }
            juego.mostrarTablero(tablero);
        }

    }
}
