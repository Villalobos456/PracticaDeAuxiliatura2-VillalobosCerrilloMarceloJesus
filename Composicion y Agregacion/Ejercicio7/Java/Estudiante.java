import java.util.ArrayList;
class Estudíante {
    public String nombre;
    public String carrera;
    public int semestre;
    public Estudíante(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public void mostrar() {
        System.out.println("Estudíante: " + nombre + ", Carrera: " + carrera + ", Semestre: " + semestre);
    }
}
class Universidad {
    public String nombre;
    public ArrayList<Estudíante> estudiantes;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    public void agregar(Estudíante e) {
        estudiantes.add(e);
    }
    public void mostrar() {
        System.out.println("Universidad: " + nombre);
        for (Estudíante e : estudiantes) {
            e.mostrar();
        }
    }
}
public class Estudiante {
    public static void main(String[] args) {
        Universidad u = new Universidad("Univalle");
        Estudíante e1 = new Estudíante("Ana", "Ingeniería", 3);
        Estudíante e2 = new Estudíante("Luis", "Medicina", 5);
        u.agregar(e1);
        u.agregar(e2);
        u.mostrar();
    }
}
