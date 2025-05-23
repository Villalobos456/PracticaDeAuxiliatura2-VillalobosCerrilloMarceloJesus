public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> pe = new ArrayList<>();
        pe.add(new Estudiante("123", "Luis", "Pérez", "777777", LocalDate.of(1995, 5, 10), "M", "RU001", "2020", 8));
        pe.add(new Estudiante("124", "Ana", "Gómez", "666666", LocalDate.of(2001, 3, 15), "F", "RU002", "2022", 4));
        pe.add(new Docente("200", "Carlos", "Pérez", "555555", LocalDate.of(1980, 4, 1), "M", "NIT001", "Ingeniero", "Software"));
        pe.add(new Docente("201", "Laura", "Gómez", "444444", LocalDate.of(1985, 8, 20), "F", "NIT002", "Matemático", "Estadística"));
        System.out.println("Estudiantes mayores de 25:");
        for (Persona p : pe) {
            if (p instanceof Estudiante && p.getEdad() > 25) {
                p.mostrar();
            }
        }
        System.out.println("\nDocente Ingeniero, masculino, mayor:");
        Docente mayor = null;
        for (Persona p : pe) {
            if (p instanceof Docente d && d.getProfesion().equals("Ingeniero") && d.getSexo().equals("M")) {
                if (mayor == null || d.getEdad() > mayor.getEdad()) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) mayor.mostrar();
        System.out.println("\nPersonas con el mismo apellido:");
        Map<String, List<Persona>> mapa = new HashMap<>();
        for (Persona p : pe) {
            mapa.putIfAbsent(p.getApellido(), new ArrayList<>());
            mapa.get(p.getApellido()).add(p);
        }
        for (var lista : mapa.values()) {
            if (lista.size() > 1) {
                for (Persona p : lista) p.mostrar();
            }
        }
    }
}
