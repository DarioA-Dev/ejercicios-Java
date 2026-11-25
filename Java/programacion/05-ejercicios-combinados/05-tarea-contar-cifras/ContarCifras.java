/*
 * CONTAR CIFRAS
 *
 * Contar las cifras de un número
 * Pide un número entero positivo y calcula cuántas cifras contiene. Por ejemplo, el número 58342 tiene cinco cifras.
 */

import java.util.Scanner;

public class ContarCifras {

    public static void main(String[] args) {
        int num;
        int digits = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un número entero positivo:");
            num = sc.nextInt();
        } while (num <= 0);

        while (num > 0) {
            num = num / 10;
            digits++;
        }

        System.out.println("El número tiene " + digits + " cifras");
        sc.close();
    }
}
