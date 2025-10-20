package JLabelJButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jlabelbuton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Etiqueta con Botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Crear un JLabel centrado en la parte superior
        JLabel etiqueta = new JLabel("Presione el botón");
        etiqueta.setBounds(50, 20, 300, 30);
        etiqueta.setFont(new Font("SansSerif", Font.BOLD, 18));
        etiqueta.setForeground(Color.MAGENTA);
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        etiqueta.setToolTipText("Etiqueta que cambiará de texto");
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.LIGHT_GRAY);
        frame.add(etiqueta);

        // Crear un JButton
        JButton boton = new JButton("Haz clic");
        boton.setBounds(150, 70, 100, 30);
        boton.setToolTipText("Botón para cambiar texto de la etiqueta");
        boton.setFont(new Font("SansSerif", Font.BOLD, 14));
        frame.add(boton);

        // Añadir ActionListener al botón para cambiar el texto y color de la etiqueta al pulsar
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Texto actualizado!");
                etiqueta.setForeground(Color.RED);
            }
        });

        frame.setVisible(true);
    }
}
