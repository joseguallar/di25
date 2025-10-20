package EjemploJLabelConPanel;

import javax.swing.*;
import java.awt.*;

// Clase principal que extiende de JFrame
public class EjemploJLabelConPanel extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor: configura la ventana y los componentes
    public EjemploJLabelConPanel() {
        setTitle("Ejemplo con JLabel y JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(null);

        // Crear un panel para agrupar las etiquetas
        JPanel panel = new JPanel();
        panel.setLayout(null);  // usamos posicionamiento absoluto
        panel.setBounds(20, 20, 340, 120);
        panel.setBorder(BorderFactory.createTitledBorder("Panel de etiquetas"));
        add(panel);

        // Primera etiqueta
        JLabel etiqueta1 = new JLabel("Hola, ¡bienvenido!");
        etiqueta1.setBounds(20, 20, 300, 30);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 16));
        etiqueta1.setForeground(Color.BLUE);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setToolTipText("Esta es la etiqueta principal");
        panel.add(etiqueta1);

        // Cambiar texto usando setText
        etiqueta1.setText("Bienvenido a la interfaz Swing");

        // Segunda etiqueta
        JLabel etiqueta2 = new JLabel("Etiqueta de ejemplo 2");
        etiqueta2.setBounds(20, 60, 200, 25);
        etiqueta2.setFont(new Font("Serif", Font.ITALIC, 14));
        etiqueta2.setForeground(Color.RED);
        etiqueta2.setOpaque(true); // Necesario para ver el fondo
        etiqueta2.setBackground(Color.YELLOW);
        etiqueta2.setToolTipText("Segunda etiqueta");
        panel.add(etiqueta2);
    }

    // Método main para ejecutar la aplicación
    public static void main(String[] args) {
        EjemploJLabelConPanel ventana = new EjemploJLabelConPanel();
        ventana.setVisible(true);
    }
}
