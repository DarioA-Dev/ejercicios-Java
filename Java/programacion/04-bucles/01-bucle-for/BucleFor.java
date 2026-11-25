
import java.util.Scanner;

class BucleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            mostrarMenu();
            option = sc.nextInt();

            switch (option) { case 1:
                    excersise1();
                    break; case 2:
                    excersise2(sc);
                    break; case 3:
                    excersise3();
                    break; case 4:
                    excersise4();
                    break; case 5:
                    excersise5(sc);
                    break; case 6:
                    excersise6();
                    break; case 7:
                    excersise7(sc);
                    break; case 8:
                    excersise8(sc);
                    break; case 9:
                    excersise9();
                    break; case 10:
                    excersise10(sc);
                    break; case 11:
                    excersise11(sc);
                    break;
                default:
            }
        } while (option != 0);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n1 Contador simple");
        System.out.println("2 Tabla de multiplicar");
        System.out.println("3 Suma números del 1 al 10");
        System.out.println("4 Mostrar números 0-10");
        System.out.println("5 Números pares hasta N");
        System.out.println("6 Números 10-0 (decreciente)");
        System.out.println("7 Números desde N hasta 10");
        System.out.println("8 Números desde el insertado al 10");
        System.out.println("9 Los cuadrados de los números");
        System.out.println("10 Mostrar suma de todos los numeros pares del 0 a N");
        System.out.println("11 Divisores del número introducido");

        System.out.print("\nElige una opción: ");
    }

    // Contador simple
    static void excersise1() {
        System.out.println("Contador simple");
        int timer = 0;
        for (int i = 0; i < 3; i++) {
            timer = timer + 1;
            System.out.println("El valor de i es: " + i);
            System.out.println("El valor del contador es: " + timer);
        }
    }

    // Tabla de multiplicar
    static void excersise2(Scanner sc) {
        System.out.print("¿Qué tabla de multiplicar quieres ver?: ");
        int number = sc.nextInt();
        System.out.println("Aquí podemos ver la tabla del " + number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    // Suma números del 1 al 10
    static void excersise3() {
        System.out.println("Suma números del 1 al 10");
        int secondTimer = 0;
        for (int i = 0; i <= 10; i++) {
            int timerResult = secondTimer + i;
            System.out.println("La suma del contador es: " + timerResult);
        }
    }

    // Mostrar números del 0 al 10
    static void excersise4() {
        System.out.println("Números del 0 al 10");
        for (int b = 0; b <= 10; b++) {
            System.out.println(b);
        }
    }

    // Números pares hasta el número que el usuario indique
    static void excersise5(Scanner sc) {
        System.out.print("¿Hasta qué número quieres sacar los pares?: ");
        int evenNumber = sc.nextInt();
        for (int i = 0; i <= evenNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Números contando hacia atrás del 10 al 0
    static void excersise6() {
        System.out.println("Números 10 al 0 (decreciente)");
        for (int c = 10; c >= 0; c--) {
            System.out.println(c);
        }
    }

    // Contar desde el número introducido hasta el 10
    static void excersise7(Scanner sc) {
        System.out.print("¿Desde qué número quieres empezar?: ");
        int number = sc.nextInt();
        for (int i = number; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Contar hacia atrás desde el número indicado al 0
    static void excersise8(Scanner sc) {
        System.out.println("Inserta un número menor a 10: ");
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Ver los cuadrados de los números del 0 al 10
    static void excersise9() {
        System.out.println("Introduce el número del cual quieras ver sus cuadrados: ");
        int squareNumber = 0;

        for (int i = 0; i <= 10; i++) {
            squareNumber = i * i;
            System.out.println("el cuadrado es"+ squareNumber);
        }
    }

    // Sumar todos los números pares desde 0 hasta el número que indique el usuario
    static void excersise10(Scanner sc) {
        int sum = 0;

    System.out.print("¿Hasta qué número quieres sumar los pares?: ");
        long evenNumber = sc.nextLong();
        for (int i = 0; i <= evenNumber; i++) {
            if (i % 2 == 0) {
                sum = i + i;
            }
        }
        System.out.println("La suma es: "+ sum);
    }

    //Saca los divisores desde el número introducido hasta el 1

    static void excersise11(Scanner sc) {
        System.out.println("Introduce un número del cual quieras saber sus divisores: ");
        int insertedNum = sc.nextInt();

        for (int i = 1; i <= insertedNum; i++) {
            if (insertedNum % i == 0) {
                System.out.println(i);
            }
        }
    }
}
