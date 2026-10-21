import java.util.Scanner;

public class GuessPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Establece un usuario:");
        String username = sc.next();

        System.out.println("\nEstablece una contraseña:");
        int password = sc.nextInt();

        boolean isAuthenticated = false;

        do {
            System.out.println("\nIntroduce el usuario:");
            String inputUsername = sc.next();

            System.out.println("Introduce la contraseña:");
            int inputPassword = sc.nextInt();

            if (!username.equalsIgnoreCase(inputUsername) || password != inputPassword) {
                System.out.println("Credenciales incorrectas. Inténtalo de nuevo.");
            } else {
                System.out.println("Acceso concedido.");        
                isAuthenticated = true;
            }
        } while (!isAuthenticated);

        sc.close();
    }
}
