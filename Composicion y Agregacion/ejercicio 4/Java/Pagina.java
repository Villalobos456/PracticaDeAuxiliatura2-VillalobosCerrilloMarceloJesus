import java.util.ArrayList;
class Pagína {
    public int numero;
    public String contenido;
    public Pagína(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }
    public void mostrar() {
        System.out.println("Página " + numero + ": " + contenido);
    }
    public int getNumero() {
        return numero;
    }
}
class Libro {
    public String titulo;
    public String autor;
    public ArrayList<Pagína> paginas;
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }
    public void agregar(Pagína pagina) {
        if (paginas.size() < 500) {
            paginas.add(pagina);
        } else {
            System.out.println("No se pueden agregar mas paginas. Límite de 500 paginas alcanzado");
        }
    }
    public void mostrar() {
        System.out.println("Libro: " + titulo + " por " + autor);
        for (Pagína p : paginas) {
            p.mostrar();
        }
    }
}
public class Pagina {
    public static void main(String[] args) {
        Libro libro = new Libro("Java Básico", "Felipez");
        libro.agregar(new Pagína(1, "Introducción a Java"));
        libro.agregar(new Pagína(2, "Variables y tipos de datos"));
        libro.agregar(new Pagína(3, "Estructuras de control"));
        libro.mostrar();
    }
}
