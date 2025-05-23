class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Carrera:", self.carrera)
        print("Semestre:", self.semestre)
class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []
    def agregar(self, estudiante):
        self.estudiantes.append(estudiante)
    def mostrar(self):
        print("Universidad:", self.nombre)
        for e in self.estudiantes:
            e.mostrar()
u = Universidad("UMSA")
u.agregar(Estudiante("Ana", "Medicina", 2))
u.agregar(Estudiante("Luis", "Derecho", 4))
u.mostrar()
