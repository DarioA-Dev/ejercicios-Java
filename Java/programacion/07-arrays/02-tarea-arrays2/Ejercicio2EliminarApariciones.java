/*
 * ARRAYS2
 *
 * 2. Eliminar todas las apariciones de un número
 * Enunciado: Dado un array, elimina todas las apariciones del
 * número 4. En el lugar del número 4 pondremos un 0
 */

public class Ejercicio2EliminarApariciones {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 4, 8, 1, 4, 6};

        System.out.println("Array original:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Cambiamos cada 4 por un 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                numbers[i] = 0;
            }
        }

        System.out.println("\nArray sin el numero 4:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
