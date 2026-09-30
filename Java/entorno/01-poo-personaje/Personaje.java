public class Personaje {
    //atributos
    private int vida;
    private int fuerza;
    private int velocidad;
    private String nombre;

    //método constructor
    public Personaje(int vida, int fuerza, int velocidad, String nombre){
        this.vida = vida;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int x){
        vida = x;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String x){
        nombre = x;
    }

    public void atacar(Personaje objetivo){
        objetivo.vida = objetivo.vida - fuerza;
    }

}
