import java.util.ArrayList;
class Componente {
    public String nombre;
    public String capacidad;
    public Componente(String nombre, String capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public void mostrar() {
        System.out.println("Componente: " + nombre + ", Capacidad: " + capacidad);
    }
}
class Computadora {
    public String marca;
    public String modelo;
    public ArrayList<Componente> componentes;
    public Computadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new ArrayList<>();
    }
    public void agregar(Componente c) {
        componentes.add(c);
    }
    public void mostrar() {
        System.out.println("Computadora: " + marca + " " + modelo);
        for (Componente c : componentes) {
            c.mostrar();
        }
    }
}
public class Componentes {
    public static void main(String[] args) {
        Computadora pc = new Computadora("Dell", "Inspiron");
        pc.agregar(new Componente("Procesador", "Intel i7"));
        pc.agregar(new Componente("Memoria RAM", "8GB"));
        pc.agregar(new Componente("Disco Duro", "1TB"));
        pc.mostrar();
    }
}
