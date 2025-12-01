import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3;

    public App() {
        super("Ejemplo FlowLayout");

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer FlowLayout en el JFrame
        setLayout(new FlowLayout());

        // Crear botones
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");

        // Añadir botones al contenedor
        add(boton1);
        add(boton2);
        add(boton3);

        // Registrar el mismo ActionListener (this) en los tres botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Comprobar qué botón ha lanzado el evento
        if (e.getSource() == boton1) {
            JOptionPane.showMessageDialog(this, "Presionaste Botón 1");
        } else if (e.getSource() == boton2) {
            JOptionPane.showMessageDialog(this, "Presionaste Botón 2");
        } else if (e.getSource() == boton3) {
            JOptionPane.showMessageDialog(this, "Presionaste Botón 3");
        }
    }

    public static void main(String[] args) {
        App ventana = new App();
        ventana.setVisible(true);
    }
}
