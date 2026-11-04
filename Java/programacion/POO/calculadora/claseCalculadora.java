package Java.programacion.POO.calculadora;

import java.util.Scanner;

public class claseCalculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        claseCalculadora sc = new claseCalculadora();

        int opcion;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            double num1 = 0;
            double num2 = 0;

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduce el segundo número: ");
                num2 = scanner.nextDouble();
            }

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sc.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + sc.restar(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + sc.multiplicar(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + sc.dividir(num1, num2));
                    }
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce un número del 0 al 4.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

}
