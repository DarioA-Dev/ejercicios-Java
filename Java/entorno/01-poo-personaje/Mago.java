public class Mago extends Personaje {

    //atributos especificos de la clase mago
    private int mana;

    public Mago(int vida, int fuerza, int velocidad, String nombre) {
        super(vida, fuerza, velocidad, nombre);
        this.mana = 30;
    }

    @Override
    public void atacar(Personaje objetivo) {
        int varVida = objetivo.getVida();
        varVida = varVida - mana;
        objetivo.setVida(varVida);
    }

}
