class Empleado {
    public String nombre, apellido;
    public double salario;
    public int añosAnti;
    public Empleado(String nombre, String apellido, double salario, int añosAnti) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.añosAnti = añosAnti;
    }
    public double calcularSalario() {
        return salario + (salario * 0.05 * añosAnti);
    }
    public String getNombre() {
        return nombre;
    }
}