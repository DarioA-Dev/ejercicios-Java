import java.util.Scanner;

public class pizzeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int amount = 0;
        int small = 0;
        int medium = 0;
        int family = 0;
        int orders = 0;
        double price = 0;
        double total = 0;

        do {
            System.out.println("\nPIZZERIA");
            System.out.println("1. Pequena (8 lereles)");
            System.out.println("2. Mediana (11 lereles)");
            System.out.println("3. Familiar (15 lereles)");
            System.out.println("0. Terminar");
            System.out.println("Elige una opcion: ");
            option = sc.nextInt();

            switch (option) {
                // pizza pequena
                case 1:
                    System.out.println("Cuantas pizzas quieres?: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("La cantidad debe ser mayor que 0, introduce de nuevo: ");
                        amount = sc.nextInt();
                    }

                    price = 8 * amount;
                    small = small + amount;

                    if (amount >= 5) {
                        price = price - price * 0.10;
                        System.out.println("Descuento del 10% aplicado");
                    }

                    System.out.println("El pedido cuesta " + price + " lereles");
                    total = total + price;
                    orders++;
                    break;
                // pizza mediana
                case 2:
                    System.out.println("Cuantas pizzas quieres?: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("La cantidad debe ser mayor que 0, introduce de nuevo: ");
                        amount = sc.nextInt();
                    }

                    price = 11 * amount;
                    medium = medium + amount;

                    if (amount >= 5) {
                        price = price - price * 0.10;
                        System.out.println("Descuento del 10% aplicado");
                    }

                    System.out.println("El pedido cuesta " + price + " lereles");
                    total = total + price;
                    orders++;
                    break;
                // pizza familiar
                case 3:
                    System.out.println("Cuantas pizzas quieres?: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("La cantidad debe ser mayor que 0, introduce de nuevo: ");
                        amount = sc.nextInt();
                    }

                    price = 15 * amount;
                    family = family + amount;

                    if (amount >= 5) {
                        price = price - price * 0.10;
                        System.out.println("Descuento del 10% aplicado");
                    }

                    System.out.println("El pedido cuesta " + price + " lereles");
                    total = total + price;
                    orders++;
                    break;
                // salir
                case 0:
                    System.out.println("Fin del programa");
                    break;
            }
        } while (option != 0);

        System.out.println("Pizzas pequenas vendidas: " + small);
        System.out.println("Pizzas medianas vendidas: " + medium);
        System.out.println("Pizzas familiares vendidas: " + family);
        System.out.println("Numero de pedidos: " + orders);
        System.out.println("Recaudacion total: " + total + " lereles");

        sc.close();
    }
}
