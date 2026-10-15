import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        int students = 0;
        int pass = 0;

        double markSum = 0;
        double mark;
        double mediaMark = 0;

        do {
        students++;

        System.out.println("Dime que nota has sacado: \n");
        mark = sc.nextDouble();
        markSum = mark + markSum;

            if (mark >= 5) {
                pass++;
            }

        } while (mark > 0);

            mediaMark = markSum / students;
            System.out.println("Hemos analizado " + students + " alumnos \n" + "La suma total de sus notas es: " + markSum +"\n" + "La nota media de los alumnos es: " + mediaMark + "\n" + "Han aprobado " + pass + " alumnos");


        sc.close();
    }
}
