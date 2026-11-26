/*
 * ARRAYS2
 *
 * 1. Comprobar si dos arrays son iguales
 * Comprueba si dos arrays tienen los mismos
 * elementos en las mismas posiciones.
 * 2. Eliminar todas las apariciones de un número
 * Enunciado: Dado un array, elimina todas las apariciones del
 * número 4. En el lugar del número 4 pondremos un 0
 * 3. Ordenar un array de menor a mayor
 * 4. Contar las apariciones de un número
 * 5. Calcular la diferencia entre el mayor y el menor
 */

public class EjerciciosArrays2 {
    public static void main(String[] args) {

        // Ejercicio 1

        int[] array1 = {3, 7, 1, 9, 4};
        int[] array2 = {3, 7, 1, 9, 4};
        boolean equal = true;

        for (int i = 0; i < 5; i++) {
            if (array1[i] != array2[i]) {
                equal = false;
            }
        }

        if (equal == true) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays no son iguales");
        }

        // Ejercicio 2

        int[] numbers = {4, 2, 4, 8, 1, 4, 6};

        for (int i = 0; i < 7; i++) {
            if (numbers[i] == 4) {
                numbers[i] = 0;
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(numbers[i]);
        }

        // Ejercicio 3

        int[] numbers2 = {9, 3, 7, 1, 5, 3, 8};
        int aux;

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (numbers2[i] > numbers2[j]) {
                    aux = numbers2[i];
                    numbers2[i] = numbers2[j];
                    numbers2[j] = aux;
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(numbers2[i]);
        }

        // Ejercicio 4

        int[] numbers3 = {2, 5, 2, 8, 2, 1, 5};
        int cont = 0;

        for (int i = 0; i < 7; i++) {
            if (numbers3[i] == 2) {
                cont++;
            }
        }

        System.out.println("El 2 aparece " + cont + " veces");

        // Ejercicio 5

        int[] numbers4 = {12, 4, 25, 7, 18};
        int highest = numbers4[0];
        int minor = numbers4[0];

        for (int i = 0; i < 5; i++) {
            if (numbers4[i] > highest) {
                highest = numbers4[i];
            }
            if (numbers4[i] < minor) {
                minor = numbers4[i];
            }
        }

        System.out.println("El mayor es " + highest);
        System.out.println("El menor es " + minor);
        System.out.println("La diferencia es " + (highest - minor));
    }
}
