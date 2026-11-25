public class PaginaWeb {

    private String nombreUsuario;
    private String dni;
    private static int visitasTotales = 0;

    // CONSTRUCTOR
    public PaginaWeb(String nombreUsuario, String dni) {
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;

        visitasTotales++;
    }

    public static void mostrarVisitas() {
        System.out.println("La cantidad total de visitas es: " + visitasTotales);
    }

    public void mostrarUsuario() {
        System.out.println("El usuario actual es: " + this.nombreUsuario);
    }

public static void main(String[] args) {
    // Creamos los 5 primeros usuarios
    PaginaWeb a1 = new PaginaWeb("Santi", "09092681");
    PaginaWeb a2 = new PaginaWeb("Carlos Sol", "09091341");
    PaginaWeb a3 = new PaginaWeb("Alex Alexis", "09091341");
    PaginaWeb a4 = new PaginaWeb("Javier Palo", "09091341");
    PaginaWeb a5 = new PaginaWeb("Admiral Orenes", "09091341");

    a1.mostrarUsuario();
    a2.mostrarUsuario();
    a3.mostrarUsuario();
    a4.mostrarUsuario();
    a5.mostrarUsuario();

    PaginaWeb.mostrarVisitas();

    PaginaWeb a6 = new PaginaWeb("Mario", "12345678A");
    PaginaWeb a7 = new PaginaWeb("Lucia", "87654321B");
    PaginaWeb a8 = new PaginaWeb("Pedro", "11223344C");

    PaginaWeb.mostrarVisitas();
}
}
