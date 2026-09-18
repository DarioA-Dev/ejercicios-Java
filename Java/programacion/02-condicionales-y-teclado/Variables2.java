import java.util.Scanner;

public class Variables2 {

    public static void main(String[] args) {
        /*int a=1;
        int result=0;
        int b=5;

        result=a+1;
        System.out.println(result);

        a--;
        System.out.println(a);

        a+=b;
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("introduce tu edad: ");
        int edad = sc.nextInt();


        if (edad >= 60)
            System.out.println("Puede tener los puntos");
        else if (edad >= 18 && edad < 60)
            System.out.println("eres demasiado pequeno");
        else
            System.out.println("No tienes ni la mayoria de edad");

        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres volve a ejecutarlo?(Si o No): ");
        if (reload == Si && reload == SI && reload == Sí)
            Sout("Ok")
        else
            Sout("Ok")*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota obtenida: ");
        int nota = sc.nextInt();

        if (nota > 10) {
            System.out.println("Esa nota es imposible de obtener");
        } else if (nota >= 5) {
            System.out.println("Has aprobado!");
        } else {
            System.out.println("Has suspendido");
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = sc.nextInt();

        boolean esMayor=(edad>=18);

        if (esMayor) {
            System.out.println("Eres mayor de edad, dame tu entrada (1 true, 0 false)");
            int entrada = sc.nextInt();

            boolean tieneEntrada = (entrada==1);
            if (tieneEntrada)
                System.out.println("Todo en orden, puedes pasar");
            else
                System.out.println("Eres mayor pero no tienes entrada, no pueds pasar");
            }
        else
            System.out.println("Eres menor, no puedes pasar");
        }*/

    //pide importe compra, si compra >= 100€ se pide la edad, si tiene +65 años = 20%, menos de 5 = 10%, si no es superior a 100€ no se aplica descuento

    Scanner sc = new Scanner(System.in);
    System.out.println("Cuánto fue el importe de la compra: ");
    int compraValor = sc.nextInt();

    if (compraValor>=100)
        System.out.println("Cuántos años tienes?: ");
        int años = sc.nextInt();

        if (años>=65) {
            System.out.println("Se te aplicará un 20% de descuetno");
        }
        else if (años<65) {
            System.out.println("Se te aplicará un 10% de descuento");
        }

    else
        System.out.println("La compra es de menos de 100€, no se te aplicará descuento");
    }
}
