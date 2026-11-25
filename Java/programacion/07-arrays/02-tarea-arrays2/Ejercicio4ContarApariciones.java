/*
 * ARRAYS2
 *
 * 4. Contar las apariciones de un número
 */

public class Ejercicio4ContarApariciones {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 2, 8, 2, 1, 5};
        int search = 2;
        int cont = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                cont++;
            }
        }

        System.out.println("El numero " + search + " aparece " + cont + " veces en el array");
    }
}
