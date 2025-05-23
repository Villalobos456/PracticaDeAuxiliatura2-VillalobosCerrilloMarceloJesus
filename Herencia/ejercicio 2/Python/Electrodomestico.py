class Electrodomestico:
    def __init__(self, precioBase, color, consumoEnergico, peso):
        self.precioBase = precioBase
        self.color = color
        self.consumoEnergico = consumoEnergico.upper()
        self.peso = peso
    def precioFinal(self):
        precio = self.precioBase
        consumoPrecio = {"A": 100, "B": 80, "C": 60, "D": 50, "E": 30, "F": 10}
        precio += consumoPrecio.get(self.consumoEnergico, 0)
        if self.peso <= 19:
            precio += 10
        elif self.peso <= 49:
            precio += 50
        elif self.peso <= 79:
            precio += 80
        else:
            precio += 100
        return precio