import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Establece un usuario:");
        String username = scanner.next();

        System.out.println("\nEstablece una contraseña:");
        int password = scanner.nextInt();

        boolean isAuthenticated = false;

        do {
            System.out.println("\nIntroduce el usuario:");
            String inputUsername = scanner.next();

            System.out.println("Introduce la contraseña:");
            int inputPassword = scanner.nextInt();

            if (!username.equalsIgnoreCase(inputUsername) || password != inputPassword) {
                System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
            } else {
                System.out.println("Acceso concedido.");        
                isAuthenticated = true;
            }
        } while (!isAuthenticated);

        scanner.close();
    }
}
