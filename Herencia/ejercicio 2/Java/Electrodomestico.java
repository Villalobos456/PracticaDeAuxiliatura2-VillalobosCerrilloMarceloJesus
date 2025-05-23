class Electrodomestico {
    public double precioBase;
    public String color;
    public char consumoEnergetico;
    public double peso;
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        this.peso = peso;
    }
    public double precioFinal() {
        double precio = precioBase;
        switch (consumoEnergetico) {
            case 'A': precio += 100; break;
            case 'B': precio += 80; break;
            case 'C': precio += 60; break;
            case 'D': precio += 50; break;
            case 'E': precio += 30; break;
            case 'F': precio += 10; break;
        }
        if (peso <= 19) precio += 10;
        else if (peso <= 49) precio += 50;
        else if (peso <= 79) precio += 80;
        else precio += 100;

        return precio;
    }
}