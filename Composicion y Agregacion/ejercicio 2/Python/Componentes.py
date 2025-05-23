class Componente:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.capacidad = capacidad
    def mostrar(self):
        print("Componente:", self.nombre)
        print("Capacidad:", self.capacidad)
class Computadora:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.componentes = []
    def agregar(self, componente):
        self.componentes.append(componente)
    def mostrar(self):
        print("Computadora:", self.marca, self.modelo)
        for c in self.componentes:
            c.mostrar()
c = Computadora("HP", "Pavilion")
c.agregar(Componente("RAM", "8GB"))
c.agregar(Componente("Disco Duro", "1TB"))
c.mostrar()
