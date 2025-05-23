import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Vehiculo[] v2025 = new Vehiculo[4];
        v2025[0] = new Coche("Ford", "Focus", 2025, 20000, 4, "Diesel");
        v2025[1] = new Coche("Ford", "Focus", 2025, 20000, 4, "Diesel");
        v2025[2] = new Moto("Yamaha", "R1", 2025, 15000, 1000, "Gasolina");
        v2025[3] = new Moto("Yamaha", "R1", 2025, 15000, 1000, "Gasolina");
        ArrayList<Coche> coches = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
        System.out.println("Vehiculos 2025");
        for (Vehiculo vehiculo : v2025) {
            if (vehiculo instanceof Coche) {
                coches.add((Coche) vehiculo);
            } else if (vehiculo instanceof Moto) {
                motos.add((Moto) vehiculo);
            }
        }
        System.out.println("Coches con mas de 4 puertas");
        for (Coche coche : coches) {
            System.out.println(coche.mostrar());
        }
    }   
}
