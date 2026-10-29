import java.util.Scanner;

public class registrosNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuales son tus notas?:");
        double mark = sc.nextDouble();

        do {
            switch ((int) mark) {
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                case 9:
                    System.out.println("Sobresaliente");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 5:
                    System.out.println("Suficiente");
                    break;
                default:
                    System.out.println("Suspenso");
                    break;
            }
            System.out.println("Introduce otra nota (negativa para salir): ");
            mark = sc.nextDouble();
        } while (mark >= 0);

        sc.close();
    }
}
