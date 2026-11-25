public class EjerciciosArrays {
    public static void main(String[] args) {

        int sum = 0;
        int minor = 0;
        int half = 0;

        // Paso 1
        int[] nota = new int[5];
        nota[0] = 1;
        nota[1] = 2;
        nota[2] = 3;
        nota[3] = 4;
        nota[4] = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println(nota[i]);
        }

        // Paso 2
        for (int i = 4; i >= 0; i--) {
            System.out.println(nota[i]);
        }

        // Paso 3
        for (int i = 0; i < 5; i++) {
            sum += nota[i];
        }
        System.out.println("\n La suma de todos los valores es: " + sum + "\n");

        // Paso 4
        minor = nota[0];
        for (int i = 0; i < 5; i++) {
            if (nota[i] < minor) {
                minor = nota[i];
            }
        }
        System.out.println("El menor es: " + minor);

        // Paso 5
        for (int i = 0; i < 5; i++) {
            if (nota[i] == 7) {
                System.out.println("El numero 7 está en el array!");
            }   
        }

        // Paso 6
        for (int i = 0; i < 5; i++) {
            half += nota[i];
        }
        half = half / 5;
        System.out.println("La media es: " + half);

    }
}
