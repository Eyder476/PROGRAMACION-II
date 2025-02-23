import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"
    
#Linea
class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea: {self.p1} -> {self.p2}"

    def dibujaLinea(self):
        print(f"Dibujando linea desde {self.p1} hasta {self.p2}")
        # Dibujar línea con Matplotlib
        plt.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'r-')
        plt.plot(self.p1.x, self.p1.y, 'bo')  # Punto inicial
        plt.plot(self.p2.x, self.p2.y, 'bo')  # Punto final

# Circulo
class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo: Centro={self.centro}, Radio={self.radio}"

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='blue', fill=False)
        plt.gca().add_patch(circulo)
        plt.plot(self.centro.x, self.centro.y, 'ro')  

if __name__ == "__main__":
    p1 = Punto(1, 1)
    p2 = Punto(4, 5)
    linea = Linea(p1, p2)
    print(linea)
    linea.dibujaLinea()

    centro = Punto(7, 7)
    circulo = Circulo(centro, 3)
    print(circulo)
    circulo.dibujaCirculo()

    plt.axis('equal')
    plt.grid(True)
    plt.title("Linea y Circulo")
    plt.show()
