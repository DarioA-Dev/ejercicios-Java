import java.util.Scanner;

public class temperaturas {

    public static void main(String[] args) {
        double temperature;
        int calor = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Qué temperatura hace? (0 para salir):");
            temperature = sc.nextDouble();

            if (temperature != 0) {
                if (temperature > 30) {
                    calor++;
                    System.out.println("Hace calor!");
                } else {
                    System.out.println("Hace frío");
                }
            }
        } while (temperature != 0);

        System.out.println("Ha hecho calor " + calor + " veces");
        sc.close();
    }
}
