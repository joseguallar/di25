package SoloJButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Ventana con un JButton y posicionamiento absoluto dentro de un JPanel
public class SoloJButton extends JFrame {

    private JButton boton;

    public SoloJButton() {
        setTitle("Demo: Solo JButton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 200);
        setLayout(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 320, 140);
        panel.setBorder(BorderFactory.createTitledBorder("Panel con JButton"));
        add(panel);

        // JButton con varias propiedades
        boton = new JButton("Púlsame");
        boton.setBounds(90, 40, 140, 40);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setForeground(Color.BLACK);
        boton.setToolTipText("Haz clic o Alt+P");
        boton.setMnemonic(KeyEvent.VK_P);        // Alt+P
        boton.setFocusPainted(true);             // muestra el anillo de foco
        panel.add(boton);

        // Alterna texto, color y estado
        boton.addActionListener(new ActionListener() {
            private boolean alterna = false;
            private int clicks = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                alterna = !alterna;
                boton.setText(alterna ? "¡Hola!" : "Púlsame");
                boton.setForeground(alterna ? Color.RED : Color.BLACK);
                boton.setToolTipText(alterna ? "Has cambiado el texto" : "Haz clic o Alt+P");
                // tras 5 clics, deshabilitar
                if (++clicks >= 5) {
                    boton.setEnabled(false);
                    boton.setToolTipText("Botón deshabilitado (5 clics)");
                }
            }
        });
    }

    public static void main(String[] args) {
        new SoloJButton().setVisible(true);
    }
}
