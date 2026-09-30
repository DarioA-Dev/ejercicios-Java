public class EjemploSwitch {

    public static void main(String[] args) {
        int dia = 2;

        switch (dia) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miércoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            default:
                System.out.println("Es fin de semana o día no válido");
                break;
        }
    }
}
