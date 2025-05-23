from Gerente import Gerente
from Desarrollador import Desarrollador
g = [Gerente("Luis", "Gomez", 2000, 5, "Ventas", 1200), Gerente("Ana", "Lara", 2200, 3, "RRHH", 800)]
d = [Desarrollador("Carlos", "Lopez", 1800, 2, "Java", 12), Desarrollador("Laura", "Perez", 1700, 4, "Python", 8)]
for i in g:
    print(f"Gerente: {i.nombre} - Salario: {i.calcular()}")
    if i.bono_gerencial > 1000:
        print(f"Bono gerencial mayor a 1000: {i.bono_gerencial}")
for j in d:
    print(f"Desarrollador: {j.nombre} - Salario: {j.calcular()}")
    if j.horas_extras > 10:
        print(f"Trabaja más de 10 horas extras: {j.horas_extras}")
