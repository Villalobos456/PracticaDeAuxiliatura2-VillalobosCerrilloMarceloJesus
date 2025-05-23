from Fijo import TFijo
from Comision import TComisionista
f = [TFijo("Ana", 1200), TFijo("Luis", 1500), TFijo("Carla", 1100)]
c = [TComisionista("Mario", 800, 0.1, 3000), TComisionista("Sofia", 1000, 0.05, 1000), TComisionista("Pablo", 900, 0.08, 2000)]
m = f[0]
for i in f:
    if i.getSalario() > m.getSalario():
        m = i
print("Fijo con mayor salario:", m.nombre, m.getSalario())
mi = c[0]
for j in c:
    if j.getSalario() < mi.getSalario():
        mi = j
print("Comisionista con menor salario:", mi.nombre, mi.getSalario())
