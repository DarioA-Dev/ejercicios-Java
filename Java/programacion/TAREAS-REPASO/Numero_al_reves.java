import java.util.Scanner;
public class Numero_al_reves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int invertido = 0;
        int resto = 0;
        System.out.println("Dime un número para que lo diga al reves");
        numero = sc.nextInt();
        do {
            resto = numero % 10;
            invertido = invertido* 10 + resto ;
            numero = numero/10;
        } while (numero>0);

        System.out.println("El numero invertido es: " + invertido);
    }

}
