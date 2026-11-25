import java.util.Scanner;

public class MenuCalculadora {

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
        MenuCalculadora sc = new MenuCalculadora();

        System.out.print("Introduce el primer número: ");
        double resultado = scanner.nextDouble();

        int opcion;

        do {
            System.out.println("\nResultado actual: " + resultado);
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el siguiente número: ");
                double num = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = sc.sumar(resultado, num);
                        break;
                    case 2:
                        resultado = sc.restar(resultado, num);
                        break;
                    case 3:
                        resultado = sc.multiplicar(resultado, num);
                        break;
                    case 4:
                        if (num == 0) {
                            System.out.println("Error: No se puede dividir entre cero.");
                        } else {
                            resultado = sc.dividir(resultado, num);
                        }
                        break;
                }
            } else if (opcion == 0) {
                System.out.println("\nResultado final: " + resultado);
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

}
