from Moto import Moto
from Coche import Coche
v2025 = [
    Coche("Toyota", "Corolla", 2025, 25000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2025, 35000, 5, "Diesel"),
    Moto("Yamaha", "R1", 2025, 18000, 1000, "RGB"),
    Moto("Honda", "CB500X", 2025, 12000, 500, "RGBXD"),
]
tc = []
tm = []
print("Vehiculos 2025")
for vehiculo in v2025:
    print(vehiculo.mostrar())
    if isinstance(vehiculo, Coche):
        tc.append(vehiculo)
    elif isinstance(vehiculo, Moto):
        tm.append(vehiculo)
print("tiene 4 puertas")
for coche in tc:
    if coche.nPuertas > 4:
        print(coche.mostrar())
