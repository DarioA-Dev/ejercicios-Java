public class tienda {
    private String code;
    private String name;
    private double price;
    private int stock;

    // CONSTRUCTOR
    public tienda(String code, String name, double price, int stock) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // GETTER Y SETTER
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // MÉTODOS
    public void sell(int quantity) {
        if (this.stock > 0 && quantity <= this.stock) {
            this.stock -= quantity;
        } else {
            System.out.println("No tenemos suficiente stock");
        }
    }

    public void refill(int quantity) {
        if (quantity <= 100) {
            System.out.println("Has repuesto " + quantity + " unidades");
            this.stock += quantity;
        } else {
            System.out.println("No puedes reponer más de 100 unidades");
        }
    }

    public double inventoryValue() {
        return stock * price;
    }

    public void changePrice(double price) {
        this.price = price;
    }

    public void showInfo() {
        System.out.println(this.code + " , " + this.name + " , " + this.stock + "\n");
    }

    public static void main(String[] args) {
        tienda p = new tienda("P01", "Monitor", 120, 25);
        p.showInfo();

        p.sell(4);
        p.showInfo();

        p.refill(18);
        p.showInfo();

        System.out.println("El valor del inventario es de " + p.inventoryValue() + "€");

        p.changePrice(30);
        p.showInfo();
    }
}
