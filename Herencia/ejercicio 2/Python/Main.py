from Lavadora import Lavadora
from Televisor import Television
electrodomesticos = [
    Lavadora(300, "Blanco", "B", 35, 40),
    Lavadora(250, "Gris", "C", 25, 28),
    Television(500, "Negro", "A", 20, 42, True),
    Television(400, "Blanco", "D", 10, 32, False)]
print("Lavadoras con carga mayor a 30kg:")
for e in electrodomesticos:
    if isinstance(e, Lavadora) and e.carga > 30:
        print("Carga:", e.carga, "kg - Precio final: ", e.precioFinal(), "€")
