class Gerente extends Empleado {
    public String departamento;
    public double bono;
    public Gerente(String nombre, String apellido, double salario, int añosAnti, String departamento, double bono) {
        super(nombre, apellido, salario, añosAnti);
        this.departamento = departamento;
        this.bono = bono;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
    public double getBonoGerencial() {
        return bono;
    }
}