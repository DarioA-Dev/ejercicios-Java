
import java.util.Scanner;

 //pide al usuario su edad, si tiene + 18 años pidele la nota del aprueba, si la nota es 5 o mas se muestr amensjae de  q se peude a matricular, si la nota es menor q 5 mostrara q no se puede matricular, y si tiene menos de 18 años se muestra q no se puede matricular pq no tiene la edad minima

public class notasExamenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos años tienes?: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Ingrese la nota media del curso anterior: ");
            double mark = sc.nextDouble();

            if (mark >= 5) {
                System.out.println("Puedes matricularte, proceda con la inscripción");
            }
            else if (mark < 5) {
                System.out.println("No puedes matricularte, se requiere un 5 o más");
            }
        }
        else {
            System.out.println("No puedes matricularte, eres menor a la edad requerida (18 años)");
        }
    sc.close();

    }

}
