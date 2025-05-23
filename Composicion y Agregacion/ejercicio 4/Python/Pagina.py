class Pagina:
    def __init__(self, numero, contenido):
        self.numero = numero
        self.contenido = contenido
    def mostrar(self):
        print("Pagina", self.numero)
        print("Contenido:", self.contenido)
class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.paginas = []
    def agregar(self, pagina):
        if len(self.paginas) < 500:
            self.paginas.append(pagina)
        else:
            print("No se pueden agregar mas paginas")
    def mostrar(self):
        print("Libro:", self.titulo, "-", self.autor)
        for p in self.paginas:
            p.mostrar()
l = Libro("Python Basico", "Teran")
for i in range(3):
    l.agregar(Pagina(i+1, "Contenido de la pagina " + str(i+1)))
l.mostrar()
