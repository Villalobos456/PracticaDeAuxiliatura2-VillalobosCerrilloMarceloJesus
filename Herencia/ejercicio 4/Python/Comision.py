from Empleado import TEmpleado
class TComisionista(TEmpleado):
    def __init__(self, nombre, base, comision, ventas):
        super().__init__(nombre)
        self.base = base
        self.comision = comision
        self.ventas = ventas
    def getSalario(self):
        return self.base + self.comision * self.ventas