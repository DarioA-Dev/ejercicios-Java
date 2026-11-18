public class bateria {
    private String brand;
    private String model;
    private int batery = 100;

    // CONSTRUCTOR
    public bateria(String brand, String model, int batery) {
        this.brand = brand;
        this.model = model;
        this.batery = batery;
    }

    // GETTER Y SETTER
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public int getBatery() {
        return batery;
    }

    // MÉTODOS
    public void llamar() {
        if (this.batery >= 5) {
            this.batery -= 5;
            System.out.println("La batería está en un " + this.batery + "%");
            if (this.batery == 0) {
                System.out.println("Te has quedado sin bateria en el telefono!");
            }
        } else {
            System.out.println("No tienes suficiente batería para llamar");
        }
    }

    public void cargar() {
        if (this.batery < 100 && this.batery >= 0) {
            this.batery += 10;
            if (this.batery > 100) {
                this.batery = 100;
            }
            System.out.println("La batería ahora es de un " + this.batery + "%");
        } else {
            System.out.println("Valor de batería imposible o ya está al 100%");
        }
    }

    public void mostrarBateria() {
        System.out.println("La batería es de " + this.batery + "%");
    }

    public void showInfo() {
        System.out.println(this.brand + " , " + this.model + " , " + this.batery + "%\n");
    }

    public static void main(String[] args) {
        bateria b1 = new bateria("Xiaomi", "17C", 94);
        b1.showInfo();

        //metodo llamar
        b1.llamar();
        b1.showInfo();

        //metodo cargar
        b1.cargar();
        b1.showInfo();

        //metodo mostrarBateria
        b1.mostrarBateria();
        b1.showInfo();

        //setters
        b1.setBatery(50);
        b1.showInfo();
    }
}
