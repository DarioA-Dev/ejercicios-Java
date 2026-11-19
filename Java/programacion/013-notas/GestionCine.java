public class GestionCine {
    private String pelicula;
    private double precio;
    private static int totalEntradas = 0;
    private int totalEntradasnoestatica = 0;
    private static double recaudacionTotal = 0;

    // CONSTRUCTOR (registra una nueva entrada)
    public GestionCine(String pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;

        this.totalEntradasnoestatica++;
        totalEntradas++;
        recaudacionTotal += precio;
    }

    // GETTERS Y SETTERS
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTotalEntradasnoestatica() {
        return totalEntradasnoestatica;
    }

    public static int getTotalEntradas() {
        return totalEntradas;
    }

    public static double getRecaudacionTotal() {
        return recaudacionTotal;
    }

    // MÉTODOS
    public void vender(int unidades) {
        if (unidades > 0) {
            this.totalEntradasnoestatica += unidades;
            totalEntradas += unidades;
            recaudacionTotal += unidades * this.precio;
            System.out.println("Se han vendido " + unidades + " entradas para '" + this.pelicula);
        } else {
            System.out.println("La cantidad de entradas a vender debe ser mayor que 0.");
        }
    }

    public void mostrarEntrada() {
        System.out.println("Película: " + this.pelicula + " | Precio: " + this.precio + "€ | Entradas propias (no estática): " + this.totalEntradasnoestatica);
    }

    public static void mostrarRecaudacion() {
        System.out.println("Recaudación total: " + recaudacionTotal + "€");
    }

    public static void mostrarTotalEntradas() {
        System.out.println("Total de entradas vendidas (estática): " + totalEntradas);
    }

    public static void main(String[] args) {
        System.out.println("REGISTRO INICIA");
        GestionCine g1 = new GestionCine("El Señor de los Anillos", 6.5);
        GestionCine g2 = new GestionCine("Interstellar", 8);

        g1.mostrarEntrada();
        g2.mostrarEntrada();

        System.out.println("\nVENTA DE ENTRADAS");
        g1.vender(4);
        g2.vender(2);

        System.out.println("\nESTADO TRAS LAS VENTAS");
        g1.mostrarEntrada();
        g2.mostrarEntrada();

        System.out.println("\nDATOS GLOBALES DEL CINE");
        GestionCine.mostrarTotalEntradas();
        GestionCine.mostrarRecaudacion();
    }
}
