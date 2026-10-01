
import java.util.Scanner;

public class numImparesWhile {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = sc.nextInt();
        int i = 1;

        while (i < num) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
