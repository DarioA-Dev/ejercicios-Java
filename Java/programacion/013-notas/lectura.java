public class lectura {
    private String title;
    private String author;
    private int pages;
    private int readedPages;

    // CONSTRUCTOR
    public lectura(String title, String author, int pages, int readedPages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.readedPages = readedPages;
    }

    // GETTERS Y SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReadedPages() {
        return readedPages;
    }

    public void setReadedPages(int readedPages) {
        this.readedPages = readedPages;
    }

    // MÉTODOS
    public void read(int quantity) {
        if (this.readedPages + quantity <= this.pages) {
            this.readedPages += quantity;
            System.out.println("Has leido " + this.readedPages + " páginas en total");
        } else {
            System.out.println("No puedes leer más páginas de las que existen");
        }
    }

    public double readedPercentaje() {
        return ((double) this.readedPages / this.pages) * 100;
    }

    public void isReaded() {
        if (this.readedPages == this.pages) {
            System.out.println("El libro está completamente leido");
        } else {
            int pagesLeft = this.pages - this.readedPages;
            System.out.println("Quedan " + pagesLeft + " páginas por leer");
        }
    }

    public void reset() {
        this.readedPages = 0;
    }

    public void compare(lectura otro) {
        if (this.pages > otro.pages) {
            System.out.println(this.title + " tiene más páginas");
        } else if (this.pages < otro.pages) {
            System.out.println(otro.title + " tiene más páginas");
        } else {
            System.out.println("Tienen las mismas páginas");
        }
    }

    public void showInfo() {
        System.out.println(this.title + " , " + this.author + " , " + this.pages + " , " + this.readedPages + "\n");
    }

    public static void main(String[] args) {
        lectura libro1 = new lectura("El Quijote", "Cervantes", 500, 50);
        lectura libro2 = new lectura("El Principito", "Saint-Exupéry", 100, 20);
        libro1.showInfo();

        //metodo read
        libro1.read(50);
        libro1.showInfo();

        //metodo readedPercentaje
        System.out.println("Porcentaje leído: " + libro1.readedPercentaje() + "%");
        libro1.showInfo();

        //metodo isReaded
        libro1.isReaded();
        libro1.showInfo();

        //metodo compare
        libro1.compare(libro2);
        libro1.showInfo();

        //metodo reset
        libro1.reset();
        libro1.showInfo();

        //setters
        libro1.setPages(600);
        libro1.showInfo();
    }
}
