public class healer extends Personaje {

    //atributos específicos de la clase healer
    private int mana;

    //CONSTRUCTOR
    public healer(int vida, int fuerza, int velocidad, String nombre, int mana) {
        super(vida, fuerza, velocidad, nombre);
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }
    public void setMana(int x){
        mana = x;
    }

    //El healer cura al objetivo: le suma vida igual a su mana
    public void curar(Personaje objetivo){
        int varVida = objetivo.getVida();
        varVida = varVida + mana;
        objetivo.setVida(varVida);
    }

}
