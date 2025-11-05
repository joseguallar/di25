package JRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Clase principal que lanza la aplicación
public class AppJRadioButton {
    public static void main(String[] args) {
        VentanaGenero ventana = new VentanaGenero();
        ventana.setVisible(true);
    }
}

// Clase que representa la ventana principal
class VentanaGenero extends JFrame {

    private JRadioButton radioHombre, radioMujer;
    private ButtonGroup grupoGenero;
    private JButton btnConfirmar;

    public VentanaGenero() {
        // Configuración básica de la ventana
        setTitle("Registro de Socios - BioFit Gym");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 310, 150);
        panel.setBorder(BorderFactory.createTitledBorder("Seleccione su género"));
        add(panel);

        // 🔹 JRadioButton: Hombre
        radioHombre = new JRadioButton("Hombre");
        radioHombre.setBounds(40, 40, 100, 25);
        radioHombre.setFont(new Font("Arial", Font.PLAIN, 14));
        radioHombre.setToolTipText("Seleccione si es hombre");
        panel.add(radioHombre);

        // 🔹 JRadioButton: Mujer
        radioMujer = new JRadioButton("Mujer");
        radioMujer.setBounds(40, 70, 100, 25);
        radioMujer.setFont(new Font("Arial", Font.PLAIN, 14));
        radioMujer.setToolTipText("Seleccione si es mujer");
        panel.add(radioMujer);

        // 🔹 Agrupar para selección exclusiva
        grupoGenero = new ButtonGroup();
        grupoGenero.add(radioHombre);
        grupoGenero.add(radioMujer);

        // 🔹 Botón de confirmación
        btnConfirmar = new JButton("Confirmar selección");
        btnConfirmar.setBounds(120, 110, 160, 30);
        btnConfirmar.setFont(new Font("SansSerif", Font.BOLD, 12));
        panel.add(btnConfirmar);

        // Evento del botón
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (radioHombre.isSelected()) {
                    JOptionPane.showMessageDialog(
                        VentanaGenero.this,
                        "Ha seleccionado: Hombre",
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else if (radioMujer.isSelected()) {
                    JOptionPane.showMessageDialog(
                        VentanaGenero.this,
                        "Ha seleccionado: Mujer",
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        VentanaGenero.this,
                        "Debe seleccionar una opción antes de confirmar.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
    }
}

