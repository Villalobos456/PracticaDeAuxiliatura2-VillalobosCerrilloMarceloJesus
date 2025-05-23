from Electrodomestico import Electrodomestico
class Television(Electrodomestico):
    def __init__(self, precioBase, color, consumoEnergico, peso, resolucion, sintonizador_tdt):
        super().__init__(precioBase, color, consumoEnergico, peso)
        self.resolucion = resolucion
        self.sintonizador_tdt = sintonizador_tdt
    def precioFinal(self):
        precio = super().precioFinal()
        if self.resolucion > 40:
            precio *= 1.30
        if self.sintonizador_tdt:
            precio += 50
        return precio