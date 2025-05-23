from Empleado import TEmpleado
class TFijo(TEmpleado):
    def __init__(self, nombre, sueldo):
        super().__init__(nombre)
        self.sueldo = sueldo
    def setSueldo(self, sueldo):
        self.sueldo = sueldo
    def getSalario(self):
        return self.sueldo