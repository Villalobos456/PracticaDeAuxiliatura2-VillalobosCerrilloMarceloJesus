public class Main {
    public static void main(String[] args) {
        TFijo[] fijos = {
            new TFijo("Ana", 1200),
            new TFijo("Luis", 1500),
            new TFijo("Carla", 1100)
        };
        TComisionista[] comisionistas = {
            new TComisionista("Mario", 800, 0.1, 3000),
            new TComisionista("Sofia", 1000, 0.05, 1000),
            new TComisionista("Pablo", 900, 0.08, 2000)
        };
        TFijo maxFijo = fijos[0];
        for (TFijo f : fijos) {
            if (f.getSalario() > maxFijo.getSalario()) {
                maxFijo = f;
            }
        }
        System.out.println("Fijo con mayor salario: " + maxFijo.getNombre() + " - " + maxFijo.getSalario());
        TComisionista minCom = comisionistas[0];
        for (TComisionista c : comisionistas) {
            if (c.getSalario() < minCom.getSalario()) {
                minCom = c;
            }
        }
        System.out.println("Comisionista con menor salario: " + minCom.getNombre() + " - " + minCom.getSalario());
    }
}
