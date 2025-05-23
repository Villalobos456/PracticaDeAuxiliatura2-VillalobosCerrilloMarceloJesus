class Television extends Electrodomestico {
    public int resolucion;
    public boolean sintonizadorTDT;
    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = tdt;
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) precio *= 1.30;
        if (sintonizadorTDT) precio += 50;
        return precio;
    }
}