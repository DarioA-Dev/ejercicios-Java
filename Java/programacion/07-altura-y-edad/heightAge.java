import java.util.Scanner;

public class heightAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos años tienes?: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Cuánto mides?: ");
            double height = sc.nextDouble();

            if (height >= 160) {
                System.out.println("Puedes pasar");
            }
            else {
                System.out.println("No puedes pasar, altura mínima 160cm");
            }

        }
        else {
            System.out.println("No puedes pasar a la atracción, no tienes la edad mínima");
        }
    }
}
