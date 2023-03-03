package tema6;

import java.util.Arrays;
import java.util.Random;

public class TablaYFunciones {
    int[] tabla = new int[10];

    public void inicializarTabla(int a, int b){
        Random random = new Random();
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = random.nextInt(a,b);
        }
    }

    public void mostrarMayor(){
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor){
                mayor = tabla[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

    @Override
    public String toString() {
        return "tabla=" + Arrays.toString(tabla);
    }

    public static void main(String[] args) {
        TablaYFunciones tabla = new TablaYFunciones();
        tabla.inicializarTabla(67, 92);
        System.out.println(tabla.toString());
        tabla.mostrarMayor();
    }
}
