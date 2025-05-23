class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso
    def mostrar(self):
        print("Parte:", self.nombre)
        print("Peso:", self.peso, "kg")
class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    def agrega(self, parte):
        self.partes.append(parte)
    def mostrar(self):
        print("Avion:", self.modelo, "-", self.fabricante)
        for p in self.partes:
            p.mostrar()
a = Avion("Boeing 737", "Boeing")
a.agrega(Parte("Motor", 2000))
a.agrega(Parte("Alas", 1500))
a.mostrar()
