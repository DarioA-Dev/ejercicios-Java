/*
 * ARRAYS2
 *
 * 1. Comprobar si dos arrays son iguales
 * Comprueba si dos arrays tienen los mismos
 * elementos en las mismas posiciones.
 */

public class Ejercicio1ArraysIguales {
    public static void main(String[] args) {

        int[] array1 = {3, 7, 1, 9, 4};
        int[] array2 = {3, 7, 1, 9, 4};
        boolean equal = true;

        // Primero miramos si tienen la misma longitud
        if (array1.length != array2.length) {
            equal = false;
        } else {
            // Comparamos posicion a posicion
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                }
            }
        }

        if (equal) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays no son iguales");
        }
    }
}
