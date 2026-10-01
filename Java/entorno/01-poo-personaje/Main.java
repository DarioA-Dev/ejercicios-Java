public class Main {

    public static void main(String[] args) {
        System.out.println("MUNDO DE PRUEBA");
        
        System.out.println("Vamos a instanciar un personaje");
        //Usamos el método constructor para instanciar un objeto de la clase Personaje
        Personaje personajeprincipal = new Personaje(100, 50, 2000, "Anastasio");        
        personajeprincipal.setNombre("Perico Anastasio");
        personajeprincipal.velocidad=(1000);
        System.out.println("El nombre del personaje es..."+ personajeprincipal.getNombre());
 
        //Usamos el método constructor para instanciar un objeto de la clase Mago
        Mago personajesecundario = new Mago(50, 50, 2000, "Gandalf", 50);
        
        int mostrarvida=0;
        mostrarvida= personajeprincipal.getVida();
        System.out.println("la vida de "+personajeprincipal.getNombre()+" es: " + mostrarvida);
        
        //atacamos con gandalf a perico y mostramos su vida
        System.out.println("el mana de "+personajesecundario.getNombre()+" es: " + personajesecundario.getMana() );
        personajesecundario.atacar(personajeprincipal);
        mostrarvida= personajeprincipal.getVida();
        System.out.println("la vida de "+personajeprincipal.getNombre()+" es: " + mostrarvida);
        System.out.println("la velocidad de "+personajeprincipal.getNombre()+" es: " + personajeprincipal.velocidad);

    
        
        
    }
    
}
