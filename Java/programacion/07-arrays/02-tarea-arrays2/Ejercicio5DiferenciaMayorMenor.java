/*
 * ARRAYS2
 *
 * 5. Calcular la diferencia entre el mayor y el menor
 */

public class Ejercicio5DiferenciaMayorMenor {
    public static void main(String[] args) {

        int[] numbers = {12, 4, 25, 7, 18};

        // Empezamos con el primer elemento del array
        int highest = numbers[0];
        int minor = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < minor) {
                minor = numbers[i];
            }
        }

        int difference = highest - minor;

        System.out.println("El mayor es: " + highest);
        System.out.println("El menor es: " + minor);
        System.out.println("La diferencia entre el mayor y el menor es: " + difference);
    }
}
