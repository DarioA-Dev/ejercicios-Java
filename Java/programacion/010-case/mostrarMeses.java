import java.util.Scanner;

public class mostrarMeses {

    public static void main(String[] args) {
        int month;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12: ");
        month = sc.nextInt();

        if (month >= 1 && month <=12) {

            switch (month) {
                case 1:
                    System.out.println("Es Enero");
                    break;
                case 2:
                    System.out.println("Es Febrero");
                    break;
                case 3:
                    System.out.println("Es Marzo");
                    break;
                case 4:
                    System.out.println("Es Abril");
                    break;
                case 5:
                    System.out.println("Es Mayo");
                    break;
                case 6:
                    System.out.println("Es Junio");
                    break;
                case 7:
                    System.out.println("Es Julio");
                    break;
                case 8:
                    System.out.println("Es Agosto");
                    break;
                case 9:
                    System.out.println("Es Septiembre");
                    break;
                case 10:
                    System.out.println("Es Octubre");
                    break;
                case 11:
                    System.out.println("Es Noviembre");
                    break;
                case 12:
                    System.out.println("Es Diciembre");
                    break;
                default:
                    System.out.println("Numero no valido");
                    break;
            }
        }

        else {
            System.out.println("Debe ser un número entre 1 y 12, ese númeor es inválido");
        }


        sc.close();
    }
}
