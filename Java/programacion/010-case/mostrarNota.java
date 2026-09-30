import java.util.Scanner;

public class mostrarNota {

    public static void main(String[] args) {
        int mark;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime qué nota has sacado: ");
        mark = sc.nextInt();

        switch (mark) {
            case 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota no valida");
                break;
        }

        sc.close();
    }
}
