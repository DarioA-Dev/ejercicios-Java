import java.util.Scanner;

public class pedirNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que nota has sacado: "+"\n");
        int mark = sc.nextInt();

        if (mark > 10) {
            System.out.println("Esa nota no es posible");
        }
        else if (mark < 0) {
            System.out.println("Esa nota no es posible");
        }
        else if (mark > 0 && mark < 5) {
            System.out.println("Estás suspenso");
        }
        else if (mark >=5) {
            System.out.println("Has aprobado");
        }
    }
}
