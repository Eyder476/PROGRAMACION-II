package ejercicio2;

import java.awt.Graphics;

public class Linea {
    private Punto inicio;
    private Punto fin;

    public Linea(Punto inicio, Punto fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void dibujarLinea(Graphics g) {
        g.drawLine(inicio.getX(), inicio.getY(), fin.getX(), fin.getY());
    }

    @Override
    public String toString() {
        return "Linea de " + inicio + " a " + fin;
    }
}
