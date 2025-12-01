import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    private JButton btnNorth, btnSouth, btnEast, btnWest, btnCenter;

    public App() {
        super("Ejemplo BorderLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Usar BorderLayout
        setLayout(new BorderLayout());

        // Crear botones
        btnNorth  = new JButton("Norte");
        btnSouth  = new JButton("Sur");
        btnEast   = new JButton("Este");
        btnWest   = new JButton("Oeste");
        btnCenter = new JButton("Centro");

        // Añadirlos a cada zona
        add(btnNorth,  BorderLayout.NORTH);
        add(btnSouth,  BorderLayout.SOUTH);
        add(btnEast,   BorderLayout.EAST);
        add(btnWest,   BorderLayout.WEST);
        add(btnCenter, BorderLayout.CENTER);

        // Registrar ActionListener
        btnNorth.addActionListener(this);
        btnSouth.addActionListener(this);
        btnEast.addActionListener(this);
        btnWest.addActionListener(this);
        btnCenter.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btnNorth) {
            JOptionPane.showMessageDialog(this, "Botón Norte presionado");
        } else if (src == btnSouth) {
            JOptionPane.showMessageDialog(this, "Botón Sur presionado");
        } else if (src == btnEast) {
            JOptionPane.showMessageDialog(this, "Botón Este presionado");
        } else if (src == btnWest) {
            JOptionPane.showMessageDialog(this, "Botón Oeste presionado");
        } else if (src == btnCenter) {
            JOptionPane.showMessageDialog(this, "Botón Centro presionado");
        }
    }

    public static void main(String[] args) {
        new App().setVisible(true);
    }
}
