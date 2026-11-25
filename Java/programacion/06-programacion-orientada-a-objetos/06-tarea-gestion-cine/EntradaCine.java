/*
 * GESTIÓN CINE
 *
 * Gestión de entradas de cine
 * Crea una clase EntradaCine con:
 * 1. pelicula: nombre de la película.
 * 2. precio: precio de la entrada.
 * 3. totalEntradas: variable estática.
 * 4. totalEntradasnoestatica
 * 5. recaudacionTotal: variable estática.
 * Implementa:
 * 1. Un constructor que registre una nueva entrada.
 * 2. Un método vender( int unidades)
 * 3. Un método mostrarEntrada().
 * 4. Un método estático mostrarRecaudacion().
 * 5. Un método estático mostrarTotalEntradas().
 */

public class EntradaCine {
    private String pelicula;
    private double precio;
    private static int totalEntradas = 0;
    private int totalEntradasnoestatica = 0;
    private static double recaudacionTotal = 0;

    // CONSTRUCTOR (registra una nueva entrada)
    public EntradaCine(String pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;

        // Al registrar la entrada, incrementamos contadores y recaudación
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
            System.out.println("Se han vendido " + unidades + " entradas para '" + this.pelicula + "'.");
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

    // MAIN CON PRUEBAS
    public static void main(String[] args) {
        // 1. Creamos entradas para dos películas distintas
        System.out.println("--- REGISTRO INICIAL ---");
        EntradaCine e1 = new EntradaCine("El Señor de los Anillos", 6.5);
        EntradaCine e2 = new EntradaCine("Interstellar", 8.0);

        e1.mostrarEntrada();
        e2.mostrarEntrada();

        // 2. Venta de más entradas para cada película
        System.out.println("\n--- VENTA DE ENTRADAS ---");
        e1.vender(4);
        e2.vender(2);

        System.out.println("\n--- ESTADO TRAS LAS VENTAS ---");
        e1.mostrarEntrada();
        e2.mostrarEntrada();

        // 3. Métodos estáticos (globales a todo el cine)
        System.out.println("\n--- DATOS GLOBALES DEL CINE ---");
        EntradaCine.mostrarTotalEntradas();
        EntradaCine.mostrarRecaudacion();
    }
}
