
class TFijo extends TEmpleado {
    public double sueldo;
    public TFijo(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public double getSalario() {
        return sueldo;
    }
}