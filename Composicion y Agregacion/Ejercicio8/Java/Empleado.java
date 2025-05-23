import java.util.ArrayList;
class Empleadoo {
    public String nombre;
    public String puesto;
    public double salario;
    public Empleadoo(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    public void mostrar() {
        System.out.println("Empleadoo: " + nombre + ", Puesto: " + puesto + ", Salario: BOB" + salario);
    }
}
class EquipoTrabajo {
    public String nombre;
    public ArrayList<Empleadoo> empleados;
    public EquipoTrabajo(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    public void agregar(Empleadoo e) {
        empleados.add(e);
    }
    public void mostrar() {
        System.out.println("Equipo: " + nombre);
        for (Empleadoo e : empleados) {
            e.mostrar();
        }
    }
}
public class Empleado {
    public static void main(String[] args) {
        EquipoTrabajo e = new EquipoTrabajo("Desarrollo");
        e.agregar(new Empleadoo("Sofia", "Programadora", 1200));
        e.agregar(new Empleadoo("Carlos", "Analista", 1100));
        e.mostrar();
    }
}
