import java.util.Scanner;

public class Restaurante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstCourse = "";
        double firstPrice = 0;

        String secondCourse = "";
        double secondPrice = 0;

        String drink = "";
        double drinkPrice = 0;

        System.out.println("Que quieres de primero?");
        System.out.println("1. Macarrones (5 euros)");
        System.out.println("2. Sopa (4 euros)");
        System.out.println("3. Ensalada (4.5 euros)");
        System.out.println("4. Nada");
        int option1 = sc.nextInt();

        switch (option1) {
            case 1:
                firstCourse = "Macarrones";
                firstPrice = 5;
                break;
            case 2:
                firstCourse = "Sanguino";
                firstPrice = 4;
                break;
            case 3:
                firstCourse = "Ensalada";
                firstPrice = 4.5;
                break;
            case 4:
                firstCourse = "Nada";
                firstPrice = 0;
                break;
            default:
                firstCourse = "Nada";
                firstPrice = 0;
                break;
        }

        System.out.println("Que quieres de segundo?");
        System.out.println("1. Hamburguesa (7 euros)");
        System.out.println("2. Filete de pollo (6 euros)");
        System.out.println("3. Merluza (8 euros)");
        System.out.println("4. Nada");
        int option2 = sc.nextInt();

        switch (option2) {
            case 1:
                secondCourse = "Hamburguesa";
                secondPrice = 7;
                break;
            case 2:
                secondCourse = "Filete de pollo";
                secondPrice = 6;
                break;
            case 3:
                secondCourse = "Merluza";
                secondPrice = 8;
                break;
            case 4:
                secondCourse = "Nada";
                secondPrice = 0;
                break;
            default:
                secondCourse = "Nada";
                secondPrice = 0;
                break;
        }

        System.out.println("Que quieres de beber?");
        System.out.println("1. Agua (1.5 euros)");
        System.out.println("2. Coca Cola (2 euros)");
        System.out.println("3. Cerveza (2.5 euros)");
        System.out.println("4. Nada");
        int option3 = sc.nextInt();

        switch (option3) {
            case 1:
                drink = "Agua";
                drinkPrice = 1.5;
                break;
            case 2:
                drink = "Coca Cola";
                drinkPrice = 2;
                break;
            case 3:
                drink = "Cerveza";
                drinkPrice = 2.5;
                break;
            case 4:
                drink = "Nada";
                drinkPrice = 0;
                break;
            default:
                drink = "Nada";
                drinkPrice = 0;
                break;
        }

        double total = firstPrice + secondPrice + drinkPrice;

        System.out.println();
        System.out.println("Cuenta:");
        System.out.println("Primero: " + firstCourse + " - " + firstPrice + " euros");
        System.out.println("Segundo: " + secondCourse + " - " + secondPrice + " euros");
        System.out.println("Bebida: " + drink + " - " + drinkPrice + " euros");
        System.out.println("Total a pagar: " + total + " euros");

        sc.close();
    }
}
