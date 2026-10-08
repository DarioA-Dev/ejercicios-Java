import java.util.Scanner;

public class cajeroAutomatico {
    //El usuario deberá elegir una opción y le programa realizará la operación correpsondiente: 1 Consultar saldo mostrará el saldo disponible, 2 Igresar diner (Lo igresa  a la cuenta)
    //3 al sacar saldo si es mas de lo q tiene, decir que no puede sacarlo, si no sacar cuanto pide y restarlo, 4 salir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;
        double balance = 0;
        double withdraw;
        int again;

        do {
            System.out.println("SANGUINO BANK - ELIGE UNA OPCIÓN \n");
            System.out.println("1. Consultar saldo \n" + "2. Ingresar dinero \n" + "3. Retirar dinero \n" + "4. Salir");

            option = sc.nextInt();

            if (option == 1) {
                System.out.println("Tu saldo es: " + balance);
            }
            else if (option == 2) {
                System.out.println("Cuánto dinero quieres ingresar?: ");
                balance = balance + sc.nextDouble();
                System.out.println("Ahora tu cuenta tiene: " + balance);
            }
            else if (option == 3) {
                System.out.println("Cuánto dinero quieres retirar?: ");
                withdraw = sc.nextDouble();
                while (withdraw > balance) {
                    System.out.println("La cantidad es superior a su balance: " + balance + "\n Ingresa una nueva cantidad");
                    withdraw = sc.nextDouble();
                }
                balance = balance - withdraw;
                System.out.println("Tu saldo actual es: " + balance);
            }

            if (option != 4) {
                System.out.println("\nQuieres volver a hacer algo? (1 = sí, 0 = no)");
                again = sc.nextInt();
                if (again == 0) {
                    option = 4;
                }
            }
        } while (option != 4);

        sc.close();
    }
}
