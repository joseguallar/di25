package JTfCombinado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTfCombinado extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
    private JLabel lblResultado;
    private JButton btnAplicar, btnLimpiar;

    public JTfCombinado() {
        setTitle("Formulario con JTextField y 2 botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 250);
        setLayout(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 380, 190);
        panel.setBorder(BorderFactory.createTitledBorder("Formulario"));
        add(panel);

        // Etiqueta de instrucción
        JLabel lblInstr = new JLabel("Introduce tu nombre:");
        lblInstr.setBounds(20, 30, 150, 25);
        panel.add(lblInstr);

        // Campo de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(180, 30, 170, 25);
        panel.add(tfNombre);

        // Botón aplicar
        btnAplicar = new JButton("Aplicar");
        btnAplicar.setBounds(80, 80, 100, 30);
        btnAplicar.setFont(new Font("SansSerif", Font.PLAIN, 13));
        panel.add(btnAplicar);

        // Botón limpiar
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(200, 80, 100, 30);
        btnLimpiar.setFont(new Font("SansSerif", Font.PLAIN, 13));
        panel.add(btnLimpiar);

        // Etiqueta resultado
        lblResultado = new JLabel("Resultado: (vacío)");
        lblResultado.setBounds(20, 130, 330, 25);
        lblResultado.setFont(new Font("SansSerif", Font.BOLD, 13));
        lblResultado.setForeground(new Color(0, 102, 204));
        panel.add(lblResultado);

        // Acción botón aplicar
        btnAplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tfNombre.getText().trim();
                if (nombre.isEmpty()) {
                    lblResultado.setText("Resultado: no hay texto (botón deshabilitado)");
                    btnAplicar.setEnabled(false);
                } else {
                    lblResultado.setText("Resultado: Hola, " + nombre + "!");
                    tfNombre.setText("");
                    btnAplicar.setText("Hecho");
                    btnAplicar.setForeground(new Color(0, 128, 0));
                    btnAplicar.setEnabled(true);
                }
            }
        
        });
    }
        public static void main(String[] args) {
            new JTfCombinado().setVisible(true);
        }
    }

