import java.util.Scanner;

public class whileTablas {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero del que quieras saber su tabla de multiplicar: ");
        int num = sc.nextInt();

        int i = 0;
        int result = 0;

        while (i <= 10) {
            result = num * i;
            System.out.println("\n" + num +" x "+ i +" = "+ result);
            i++;
        }
    }
}
