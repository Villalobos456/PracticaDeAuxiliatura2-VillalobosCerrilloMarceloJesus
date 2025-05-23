import java.util.ArrayList;
class Partee {
    public String nombre;
    public double peso;
    public Partee(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    public void mostrar() {
        System.out.println("Partee: " + nombre + ", Peso: " + peso + " kg");
    }
}
class Avion {
    public String modelo;
    public String fabricante;
    public ArrayList<Partee> partes;
    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }
    public void agregar(Partee parte) {
        partes.add(parte);
    }
    public void mostrar() {
        System.out.println("Avion modelo: " + modelo + ", fabricante: " + fabricante);
        for (Partee p : partes) {
            p.mostrar();
        }
    }
}
public class Parte {
    public static void main(String[] args) {
        Avion a = new Avion("A320", "Airbus");
        a.agregar(new Partee("Motor", 1200));
        a.agregar(new Partee("Alas", 800));
        a.agregar(new Partee("Tren de aterrizaje", 500));
        a.mostrar();
    }
}
