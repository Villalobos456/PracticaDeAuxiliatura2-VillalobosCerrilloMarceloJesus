class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
    def mostrar(self):
        print("Titulo:", self.titulo)
        print("Autor:", self.autor)
class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros = []
    def agregar(self, libro):
        self.libros.append(libro)
    def mostrar(self):
        print("Biblioteca:", self.nombre)
        for l in self.libros:
            l.mostrar()
l1 = Libro("Cien Años de Soledad", "García Marquez")
l2 = Libro("1984", "George Orwell")
b = Biblioteca("Central")
b.agregar(l1)
b.agregar(l2)
b.mostrar()
