public class Main {

    public static void main(String[] args) {
        System.out.println("mundo de prueba");
        System.out.println("Vamos a instanciar al personaje");
        Personaje presonajeprincipal = new Personaje(100, 50, 2000, "Paco");

        int showLife=0;
        showLife = presonajeprincipal.getLife();
        System.out.println(showLife);

        presonajeprincipal.setName("Paco");
        System.out.println("El nombre del personaje es"+ presonajeprincipal.getName());
    }

}
