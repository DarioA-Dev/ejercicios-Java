public class Main {

    public static void main(String[] args) {
        System.out.println("MUNDO DE PRUEBA");
        System.out.println("Vamos a instanciar un personaje");
        Personaje personajeprincipal = new Personaje(100, 50, 2000, "Anastasio");

        int mostrarvida=0;
        mostrarvida = personajeprincipal.getVida();
        System.out.println(mostrarvida);

        personajeprincipal.setNombre("Perico Anastasio");
        System.out.println("El nombre del personaje es..."+ personajeprincipal.getNombre());

        Mago personajesecundario = new Mago(50, 50, 2000, "Gandalf");

        personajesecundario.atacar(personajeprincipal);

        mostrarvida = personajeprincipal.getVida();
        System.out.println("La vida de "+ personajeprincipal.getNombre()+ " es: "+ mostrarvida);
    }

}
