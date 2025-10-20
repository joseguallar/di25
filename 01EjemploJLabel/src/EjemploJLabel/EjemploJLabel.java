package EjemploJLabel;

import javax.swing.*;
import java.awt.*;

public class EjemploJLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo con JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Crear un JLabel con texto inicial y configurar su fuente, color y alineación
        JLabel etiqueta1 = new JLabel("Hola, ¡bienvenido!");
        etiqueta1.setBounds(50, 20, 300, 30);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 16));
        etiqueta1.setForeground(Color.BLUE);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setToolTipText("Esta es la etiqueta principal");
        frame.add(etiqueta1);

        // Cambiar el texto del JLabel utilizando setText
        etiqueta1.setText("Bienvenido a la interfaz Swing");

        // Crear otra etiqueta con diferentes propiedades de estilo
        JLabel etiqueta2 = new JLabel("Etiqueta de ejemplo 2");
        etiqueta2.setBounds(50, 60, 200, 25);
        etiqueta2.setFont(new Font("Serif", Font.ITALIC, 14));
        etiqueta2.setForeground(Color.RED);
        etiqueta2.setOpaque(true);             // Necesario para que se vea el fondo
        etiqueta2.setBackground(Color.YELLOW);
        etiqueta2.setToolTipText("Segunda etiqueta");
        frame.add(etiqueta2);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
