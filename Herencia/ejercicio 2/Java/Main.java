public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[4];
        electrodomesticos[0] = new Lavadora(300, "Blanco", 'B', 35, 40);
        electrodomesticos[1] = new Lavadora(250, "Gris", 'C', 25, 28);
        electrodomesticos[2] = new Television(500, "Negro", 'A', 20, 42, true);
        electrodomesticos[3] = new Television(400, "Blanco", 'D', 10, 32, false);
        System.out.println("Lavadoras con carga mayor a 30kg:");
        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Lavadora && ((Lavadora)e).getCarga() > 30) {
                System.out.println("Carga: " + ((Lavadora)e).getCarga() + "kg - Precio final: " + e.precioFinal() + "€");
            }
        }
    }
}
