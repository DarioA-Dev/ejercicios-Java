public class Mago extends Personaje {

    //atributos específicos de la clase mago
    private int mana;

    //CONSTRUCTOR
    public Mago(int vida, int fuerza, int velocidad, String nombre, int mana) {
        super(vida, fuerza, velocidad, nombre);
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }
    public void setMana(int x){
        mana = x;
    }

    //Ejemplo de polimorfismo (sobreescribimos el método heredado de la clase Personaje
    @Override
    public void atacar(Personaje objetivo){
        int varVida = objetivo.getVida();
        varVida = varVida - mana;
        objetivo.setVida(varVida);

        objetivo.velocidad = objetivo.velocidad - mana;

    }

}
