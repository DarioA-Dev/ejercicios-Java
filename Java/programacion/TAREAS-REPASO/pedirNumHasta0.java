import java.util.Scanner;

public class pedirNumHasta0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una contraseña numérica: ");
        int passwd = sc.nextInt();

        System.out.println("PANEL DE LOG IN" + "\n" + "Ingresa la contraseña");
        int passwdTry = sc.nextInt();

        while(passwd != passwdTry) {
            System.out.println("\n Contrasña incorrecta, intentalo de nuevo, o marca 0 para salir");
            passwdTry = sc.nextInt();

            if (passwdTry == 0) {
                System.out.println("Saliendo del sistema...");
                break;
            }
            
            else if (passwd == passwdTry) {
                System.out.println("\n Contraseña correcta, puedes continuar");
                break;
            }
        }
    }
}
