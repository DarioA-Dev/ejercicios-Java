import java.util.Scanner;

public class DiasMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero del mes (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Enero tiene 31 dias.");
                break;
            case 2:
                System.out.println("Febrero tiene 28 dias (o 29 si es bisiesto).");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias.");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias.");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias.");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias.");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias.");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 dias.");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias.");
                break;
            default:
                System.out.println("Numero no valido. Debe ser un numero del 1 al 12.");
                break;
        }

        sc.close();
    }
}
