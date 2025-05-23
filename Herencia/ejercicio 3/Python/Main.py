from Estudiante import Estudiante
from Docente import Docente
p = [Estudiante("123", "Luis", "Pérez", "777777", (1995, 5, 10), "M", "RU001", "2020", 8), Estudiante("124", "Ana", "Gómez", "666666", (2001, 3, 15), "F", "RU002", "2022", 4), Docente("200", "Carlos", "Pérez", "555555", (1980, 4, 1), "M", "NIT001", "Ingeniero", "Software"), Docente("201", "Laura", "Gómez", "444444", (1985, 8, 20), "F", "NIT002", "Matemático", "Estadística")]
print("Estudiantes mayores de 25 años:")
for i in p:
    if isinstance(i, Estudiante) and i.edad() > 25:
        i.mostrar()
print("\nDocente ingeniero, masculino y el mayor:")
inge = [ d for d in p
    if isinstance(d, Docente) and d.profesion == "Ingeniero" and d.sexo.upper() == "M"]
if inge:
    mayor = max(inge, key=lambda d: d.edad())
    mayor.mostrar()
print("\nPersonas con el mismo apellido:")
a = {}
for i in p:
    a.setdefault(i.apellido, []).append(i)
for j in a.values():
    if len(j) > 1:
        for i in j:
            i.mostrar()
