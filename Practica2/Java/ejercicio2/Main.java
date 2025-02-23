package ejercicio2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Main extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Obtener ancho y alto del panel
        int ancho = getWidth();
        int alto = getHeight();

        // Dibujar ejes X e Y en el centro del panel
        g.setColor(Color.GRAY);
        g.drawLine(ancho / 2, 0, ancho / 2, alto);  // Eje Y
        g.drawLine(0, alto / 2, ancho, alto / 2);   // Eje X

        // Dibujar marcas en el plano cartesiano
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < ancho; i += 50) {
            // Marcas en el eje X
            g.drawLine(i, alto / 2 - 5, i, alto / 2 + 5);
            // Líneas de la cuadrícula vertical
            g.drawLine(i, 0, i, alto);
        }

        for (int i = 0; i < alto; i += 50) {
            // Marcas en el eje Y
            g.drawLine(ancho / 2 - 5, i, ancho / 2 + 5, i);
            // Líneas de la cuadrícula horizontal
            g.drawLine(0, i, ancho, i);
        }

        // Ajustar coordenadas para dibujar en el plano cartesiano
        g.translate(ancho / 2, alto / 2);  // Trasladar origen al centro

        // Dibujar Linea y Circulo
        g.setColor(Color.RED);
        Punto p1 = new Punto(-100, -100);
        Punto p2 = new Punto(100, 100);
        Linea linea = new Linea(p1, p2);

        Punto centro = new Punto(0, 0);
        int radio = 100;
        Circulo circulo = new Circulo(centro, radio);

        linea.dibujarLinea(g);
        circulo.dibujarCirculo(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Plano Cartesiano con Linea y Circulo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 800);
        ventana.add(new Main());
        ventana.setVisible(true);
    }
}
