/*
 * ACCESO
 *
 * Sistema de acceso con bloqueo
 * Desarrolla un programa que solicite un usuario y una contraseña.
 * El usuario tendrá un máximo de 3 intentos para introducir correctamente ambos datos.
 * - Si los dos datos son correctos, mostrará un mensaje de bienvenida.
 * - Si alguno es incorrecto, informará del número de intentos restantes.
 * - Si agota los intentos, bloqueará el acceso.
 * - El programa debe terminar tanto si el acceso es correcto como si se produce el bloqueo.
 */

import java.util.Scanner;

public class SistemaAcceso {
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
