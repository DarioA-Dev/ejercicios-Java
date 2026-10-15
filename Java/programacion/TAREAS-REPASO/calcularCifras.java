import java.util.Scanner;

public class calcularCifras {

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
