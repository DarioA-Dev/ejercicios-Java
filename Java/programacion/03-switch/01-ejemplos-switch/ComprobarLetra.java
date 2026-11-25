import java.util.Scanner;

public class ComprobarLetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una letra: ");
        String letra = sc.next();

        switch (letra) {
            case "a", "A":
                System.out.println("Es la vocal A");
                break;
            case "e", "E":
                System.out.println("Es la vocal E");
                break;
            case "i", "I":
                System.out.println("Es la vocal I");
                break;
            case "o", "O":
                System.out.println("Es la vocal O");
                break;
            case "u", "U":
                System.out.println("Es la vocal U");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        sc.close();
    }
}
