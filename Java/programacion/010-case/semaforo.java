import java.util.Scanner;

public class semaforo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el color del semaforo (verde, ambar, rojo): ");
        String color = sc.nextLine().toLowerCase();

        switch (color) {
            case "verde":
                System.out.println("Puedes pasar");
                break;
            case "rojo":
                System.out.println("No puedes pasar, debes detenerte");
                break;
            case "ambar":
                System.out.println("Precaucion: debes detenerte si puedes hacerlo con seguridad");
                break;
            default:
                System.out.println("Color no valido");
                break;
        }

        sc.close();
    }
}
