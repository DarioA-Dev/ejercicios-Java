import java.util.Scanner;

public class adivinarNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secretNum = 0;
        int userNum = 0;
        int attemps = 5;

        System.out.println("Ingresa un número para hacerlo secreto:");
        secretNum = sc.nextInt();

        do {
            System.out.println("\n Ingresa un número que crees que puede ser:");
                userNum = sc.nextInt();

            attemps--;

            if (userNum < secretNum) {
                System.out.println("El número secreto es mayor");
            }
            else if (userNum > secretNum) {
                System.out.println("El número secreto es menor");
            }

            if (userNum != secretNum && attemps > 0) {
                System.out.println("Te quedan " + attemps + " intentos");
            }
        } while (userNum != secretNum && attemps > 0);

        if (userNum == secretNum) {
            System.out.println("Enhorabuena, has acertado!");
        } else {
            System.out.println("Has fallado todos los intentos posibles");
        }
        sc.close();
    }
}
