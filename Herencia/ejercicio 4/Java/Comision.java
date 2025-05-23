class TComisionista extends TEmpleado {
    public double base, comision, ventas;
    public TComisionista(String nombre, double base, double comision, double ventas) {
        super(nombre);
        this.base = base;
        this.comision = comision;
        this.ventas = ventas;
    }
    @Override
    public double getSalario() {
        return base + (comision * ventas);
    }
}