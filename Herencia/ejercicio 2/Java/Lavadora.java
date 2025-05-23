class Lavadora extends Electrodomestico {
    public double carga;
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) precio += 50;
        return precio;
    }
    public double getCarga() {
        return carga;
    }
}