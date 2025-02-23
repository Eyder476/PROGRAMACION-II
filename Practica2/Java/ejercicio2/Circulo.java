package ejercicio2;

import java.awt.Graphics;

public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public void dibujarCirculo(Graphics g) {
        int x = centro.getX() - radio;
        int y = centro.getY() - radio;
        int diametro = 2 * radio;
        g.drawOval(x, y, diametro, diametro);
    }

    @Override
    public String toString() {
        return "Circulo en " + centro + " con radio " + radio;
    }
}
