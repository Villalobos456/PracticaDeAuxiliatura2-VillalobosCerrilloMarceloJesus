class Empleado:
    def __init__(self, nombre, puesto, salario):
        self.nombre = nombre
        self.puesto = puesto
        self.salario = salario
    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Puesto:", self.puesto)
        print("Salario:", self.salario)
class EquipoTrabajo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.empleados = []
    def agregar(self, empleado):
        self.empleados.append(empleado)
    def mostrar(self):
        print("Equipo de Trabajo:", self.nombre)
        for i in self.empleados:
            i.mostrar()
e = EquipoTrabajo("Proyecto A")
e.agregar(Empleado("Maria", "Diseñadora", 3500))
e.agregar(Empleado("José", "Programador", 4000))
e.mostrar()
