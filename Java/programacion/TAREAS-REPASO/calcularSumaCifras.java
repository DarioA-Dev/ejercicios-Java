import java.util.Scanner;

public class calcularSumaCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número entero positivo: ");
        int num = sc.nextInt();
        int rest = 0;
        int increase = 0;
        int sum = 0;
        int highestNum = 0;

        if (num <= 0) {
            System.out.println("Debe ser un número POSITIVO, introduce de nuevo: ");
            num = sc.nextInt();
        }

        do {
            rest = num % 10;
            num = num / 10;
            sum = sum + rest;

            if (rest >= 1) {
                increase++;
            }

            if (rest >= 1 && rest > rest) {
                highestNum = rest;
            }
            System.out.println(rest);
        } while (num > 0);

        System.out.println("El número de cifras es " + increase + " , la suma de sus cifras es " + sum + " y la cifra más grande es " + highestNum);

    }
}
