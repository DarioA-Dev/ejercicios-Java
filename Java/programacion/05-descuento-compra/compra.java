import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        //pide importe compra, si compra >= 100€ se pide la edad, si tiene +65 years = 20%, menos de 5 = 10%, si no es superior a 100€ no se aplica descuento

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Cuánto fue el importe de la compra: ");
            double compraValor = sc.nextInt();

            if (compraValor >= 100) {
                System.out.println("Cuántos años tienes?: ");
                int years = sc.nextInt();

                if (years >= 65) {
                    double fristDiscount = compraValor * 0.8;
                    System.out.println("Se te aplicará un 20% de descuento, ahora la cuenta es: "+ fristDiscount);
                }
                else if (years < 65) {
                    double secondDiscount = compraValor * 0.9;
                    System.out.println("Se te aplicará un 10% de descuento, ahora la cuenta es: "+ secondDiscount);
                }
            }
            else {
                System.out.println("La compra es de menos de 100 EUR, no se te aplicará descuento, precio final: "+ compraValor);
            }
//Para volver a ejecutar el programa, hacemos q la clase q pusimos como string la comparemos con equalsIgnoreCase para poder compararlo con el imput, el "lsIgnoreCase" hace q ignore si es mayuscula o no
            System.out.println("¿Quieres volver a ejecutar el programa?: S / N");
            String reloadString = sc.next();

            if (reloadString.equalsIgnoreCase("S")) {
                continuar = true;
            }
            else if (reloadString.equalsIgnoreCase("N")) {
                System.out.println("De acuerdo");
                continuar = false;
            }
        }

        sc.close();
    }
}
