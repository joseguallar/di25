package JTfCombinado2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTfCombinado2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField con JButton y JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Etiqueta de instrucción
        JLabel labelInstr = new JLabel("Introduce tu nombre:");
        labelInstr.setBounds(50, 30, 150, 25);
        frame.add(labelInstr);

        // Campo de texto para el nombre
        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(200, 30, 150, 25);
        campoNombre.setColumns(10);
        campoNombre.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(campoNombre);

        // Botón para saludar
        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(150, 70, 100, 30);
        frame.add(botonSaludar);

        // Etiqueta para mostrar el saludo
        JLabel labelSaludo = new JLabel();
        labelSaludo.setBounds(50, 120, 300, 25);
        labelSaludo.setFont(new Font("Arial", Font.BOLD, 14));
        labelSaludo.setForeground(Color.BLUE);
        frame.add(labelSaludo);

        // Acción del botón al pulsar: actualizar saludo con el nombre ingresado
        botonSaludar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                labelSaludo.setText("¡Hola, " + nombre + "!");
                campoNombre.setText("");
            }
        });

        frame.setVisible(true);
    }
}
