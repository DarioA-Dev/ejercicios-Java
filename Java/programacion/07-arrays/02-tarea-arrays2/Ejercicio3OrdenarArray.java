/*
 * ARRAYS2
 *
 * 3. Ordenar un array de menor a mayor
 */

public class Ejercicio3OrdenarArray {
    public static void main(String[] args) {

        int[] numbers = {9, 3, 7, 1, 5, 3, 8};
        int temp = 0;

        // Comparamos cada posicion con las siguientes y si es mayor las intercambiamos
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado de menor a mayor:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
