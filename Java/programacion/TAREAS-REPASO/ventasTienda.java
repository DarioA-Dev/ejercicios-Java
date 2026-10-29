import java.util.Scanner;

public class ventasTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int increase = 0;
        double price = 0;
        double sum = 0;
        double average = 0;

        do {
            cont++;
            System.out.println("Introduce el precio del producto " + cont + ": ");
            price = sc.nextDouble();

            if (price < 0) {
                System.out.println("El precio no puede ser negativo, introduce de nuevo: ");
                price = sc.nextDouble();
            }

            sum = sum + price;

            if (price > 50) {
                increase++;
            }
        } while (cont < 5);

        average = sum / 5;

        System.out.println("El total vendido es " + sum + " euros, el precio medio es " + average + " euros y hay " + increase + " productos que cuestan mas de 50 euros");

        sc.close();
    }
}
