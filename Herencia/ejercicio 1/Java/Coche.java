public class Coche extends Vehiculo{
    public int puerta;
    public String conbustible;

    public Coche(String marca, String modelo, int año, double precio, int puerta, String conbustible) {
        super(marca, modelo, año, precio);
        this.puerta = puerta;
        this.conbustible = conbustible;
    }

    public String mostrar() {
        return super.mostrar() + "puerta: " + puerta + "conbustible: " + conbustible;
    }
    
    public int getnPuertas() {
        return puerta;
    }
}
