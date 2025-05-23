public class Main {
    public static void main(String[] args) {
        Gerente[] g = {
            new Gerente("Luis", "Gomez", 2000, 5, "Ventas", 1200),
            new Gerente("Ana", "Lara", 2200, 3, "RRHH", 800)
        };
        Desarrollador[] d = {
            new Desarrollador("Carlos", "Lopez", 1800, 2, "Java", 12),
            new Desarrollador("Laura", "Perez", 1700, 4, "Python", 8)
        };
        for (Gerente i : g) {
            System.out.println("Gerente: " + i.getNombre() + "Salario: " + i.calcularSalario());
            if (i.getBonoGerencial() > 1000) {
                System.out.println("Bono gerencial mayor a 1000: " + i.getBonoGerencial());
            }
        }
        for (Desarrollador j : d) {
            System.out.println("Desarrollador: " + j.getNombre() + "Salario: " + j.calcularSalario());
            if (j.getHorasExtras() > 10) {
                System.out.println("Trabaja más de 10 horas extras: " + j.getHorasExtras());
            }
        }
    }
}
