import java.util.Scanner;

public class repaso {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números" + "\n" + "Numero 1: " + "\n");
        int num1 = sc.nextInt();

        System.out.println("Numero 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El " + num1 + " es mayor que " + num2);
        }
        else if (num1 == num2) {
            System.out.println("Los números " + num1 +" y " + num2 + " son iguales");
        }
        else {
            System.out.println("El " + num2 + " es mayor que " + num1);
        }
    }
}
