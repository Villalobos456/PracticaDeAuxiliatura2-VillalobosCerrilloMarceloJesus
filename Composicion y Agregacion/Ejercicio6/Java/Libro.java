import java.util.ArrayList;
class Líbro {
    public String titulo;
    public String autor;
    public Líbro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public void mostrar() {
        System.out.println("Líbro: " + titulo + ", Autor: " + autor);
    }
}
class Biblioteca {
    public String nombre;
    public ArrayList<Líbro> libros;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public void agregar(Líbro libro) {
        libros.add(libro);
    }
    public void mostrar() {
        System.out.println("Biblioteca: " + nombre);
        for (Líbro l : libros) {
            l.mostrar();
        }
    }
}
public class Libro {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Central");
        Líbro l1 = new Líbro("1984", "George");
        Líbro l2 = new Líbro("El Princi-pito", "Antoine goat");
        b.agregar(l1);
        b.agregar(l2);
        b.mostrar();
    }
}
