import java.util.ArrayList;
class Prodúcto {
    public String nombre;
    public double precio;
    public Prodúcto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrar() {
        System.out.println("Prodúcto: " + nombre + ", Precio: BOB" + precio);
    }
}
class CarritoCompras {
    public ArrayList<Prodúcto> productos;
    public CarritoCompras() {
        productos = new ArrayList<>();
    }
    public void agrega(Prodúcto p) {
        if (productos.size() < 10) {
            productos.add(p);
        } else {
            System.out.println("No se pueden agregar más productos, carro lleno");
        }
    }
    public void mostrar() {
        System.out.println("Carrito de compras:");
        for (Prodúcto p : productos) {
            p.mostrar();
        }
    }
}
public class Producto {
    public static void main(String[] args) {
        CarritoCompras c = new CarritoCompras();
        c.agrega(new Prodúcto("Leche", 1.5));
        c.agrega(new Prodúcto("Pan", 0.8));
        c.agrega(new Prodúcto("Queso", 2.5));
        c.mostrar();
    }
}