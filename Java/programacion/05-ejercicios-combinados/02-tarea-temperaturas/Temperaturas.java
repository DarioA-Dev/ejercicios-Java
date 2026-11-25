/*
 * TEMPERATURAS
 *
 * 25. Temperaturas
 * Pide temperaturas al usuario y calcula cuántas han sido superiores a 30 grados.
 * El programa terminará cuando introduzca  0
 *
 * Ejemplo:
 * 40
 * 50
 * 60
 *
 * El mensaje final de salida que deberá mostrar el programa será tal como:
 *
 * Las temperaturas superiores a 30 grados han sido 3
 */

import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        double temperature;
        int highTemperature = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Qué temperatura hace? (0 para salir):");
            temperature = sc.nextDouble();

            if (temperature != 0) {
                if (temperature > 30) {
                    highTemperature++;
                    System.out.println("Hace calor!");
                }
                else {
                    System.out.println("Hace frío");
                }
            }
        } while (temperature != 0);

        System.out.println("Ha hecho calor " + highTemperature + " veces");
        sc.close();
    }
}
