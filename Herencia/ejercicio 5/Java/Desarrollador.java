class Desarrollador extends Empleado {
    public String lenguaje;
    public int horas;
    public Desarrollador(String nombre, String apellido, double salario, int añosAnti, String lenguaje, int horas) {
        super(nombre, apellido, salario, añosAnti);
        this.lenguaje = lenguaje;
        this.horas = horas;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (horas * 20);
    }
    public int getHorasExtras() {
        return horas;
    }
}