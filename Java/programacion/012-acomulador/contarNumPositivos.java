import java.util.Scanner;

public class contarNumPositivos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int i = 0;

        while (num >= 0) {
            i++;
            System.out.println("\n" + "Ingrese otro número: ");
            num = sc.nextInt();
            /*if (num < 0) {
                break;
            }*/
        }

        System.out.println(i);

    }
}
