from Electrodomestico import Electrodomestico
class Lavadora(Electrodomestico):
    def __init__(self, precioBase, color, consumoEnergico, peso, carga):
        super().__init__(precioBase, color, consumoEnergico, peso)
        self.carga = carga
    def precioFinal(self):
        precio = super().precioFinal()
        if self.carga > 30:
            precio += 50
        return precio