public class Personaje {
//atributos
    private int life;
    private int strength;
    private int speed;
    private String name;
//metodo constructor
    public Personaje(int life, int strength, int speed, String name){
        this.life = life;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
    }

    public int getLife(){
        return life;
    }

    public void setLife(int x){
        life = x;
    }

    public String getName(){
        return name;
    }

    public void setName(String x){
        name = x;
    }

}
