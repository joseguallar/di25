package JButtonJTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonJTextField extends JFrame {
    private JTextField campoTexto;
    private JButton boton;

    public JButtonJTextField() {
        setTitle("Ejemplo: JButton con JTextField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(null);

        // Crear campo de texto
        campoTexto = new JTextField("Escribe algo...");
        campoTexto.setBounds(50, 50, 200, 30);
        add(campoTexto);

        // Crear botón
        boton = new JButton("Limpiar");
        boton.setBounds(260, 50, 80, 30);
        boton.setFont(new Font("Arial", Font.PLAIN, 12));
        boton.setToolTipText("Haz clic para vaciar el campo de texto");
        boton.setForeground(Color.DARK_GRAY);
        add(boton);

        // Acción del botón: limpiar el campo y deshabilitar
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
                boton.setText("¡Listo!");
                boton.setEnabled(false);
                boton.setForeground(Color.GRAY);
            }
        });
    }

    public static void main(String[] args) {
        new JButtonJTextField().setVisible(true);
    }
}
