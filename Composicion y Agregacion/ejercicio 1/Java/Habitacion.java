import java.util.ArrayList;
class Habitacionn {
    public String nombre;
    public double tamano;
    public Habitacionn(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }
    public String getNombre() {
        return nombre;
    }
    public double getTamano() {
        return tamano;
    }
    public void mostrar() {
        System.out.println("Habitación: " + nombre + ", Tamaño: " + tamano + " m2");
    }
}
class Casa {
    public String direccion;
    public ArrayList<Habitacionn> habitaciones;
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }
    public String getDireccion() {
        return direccion;
    }
    public void agregar(Habitacionn habitacion) {
        habitaciones.add(habitacion);
    }
    public void mostrar() {
        System.out.println("Casa en: " + direccion);
        for (Habitacionn h : habitaciones) {
            h.mostrar();
        }
    }
}
public class Habitacion {
    public static void main(String[] args) {
        Casa c = new Casa("Calle Falsa 123");
        c.agregar(new Habitacionn("Sala", 20));
        c.agregar(new Habitacionn("Cocina", 10));
        c.agregar(new Habitacionn("Dormitorio", 15));
        c.mostrar();
    }
}
