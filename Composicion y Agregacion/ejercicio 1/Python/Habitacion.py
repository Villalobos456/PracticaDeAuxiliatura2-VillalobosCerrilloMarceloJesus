class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano
    def mostrar(self):
        print("Habitacion:", self.nombre)
        print("Tamaño:", self.tamano, "m^2")
class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []
    def agregar(self, habitacion):
        self.habitaciones.append(habitacion)
    def mostrar(self):
        print("Direccion:", self.direccion)
        for h in self.habitaciones:
            h.mostrar()
h1 = Habitacion("Sala", 25)
h2 = Habitacion("Cocina", 15)
c = Casa("Calle 123")
c.agregar(h1)
c.agregar(h2)
c.mostrar()
