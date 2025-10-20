package JTextAreaAgencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    private JTextArea areaTexto;
    private JButton btnAñadir;

    public App() {
        setTitle("Información de Reserva de Viaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 350);
        setLayout(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 410, 250);
        panel.setBorder(BorderFactory.createTitledBorder("Detalle de la Reserva"));
        add(panel);

        // JTextArea con datos iniciales
        areaTexto = new JTextArea("Pasajero: Ana López\n"
                                + "Destino: Roma, Italia\n"
                                + "Vuelo: AZ678 - 15/11/2025\n"
                                + "Hotel: Roma Plaza\n"
                                + "Estado de la reserva: Confirmada");
        areaTexto.setBounds(20, 30, 370, 170);
        areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 12));
        areaTexto.setForeground(Color.DARK_GRAY);
        areaTexto.setBackground(Color.WHITE);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setEditable(false);
        panel.add(areaTexto);

        // Botón "Añadir texto"
        btnAñadir = new JButton("Añadir texto");
        btnAñadir.setBounds(140, 210, 120, 30);
        panel.add(btnAñadir);

        // Acción del botón
        btnAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean continuar = true;
                while (continuar) {
                    int respuesta = JOptionPane.showConfirmDialog(
                        App.this,
                        "¿Desea añadir más texto?",
                        "Añadir texto",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (respuesta == JOptionPane.YES_OPTION) {
                        String nuevoTexto = JOptionPane.showInputDialog(
                           App.this,
                            "Introduzca el texto a añadir:"
                        );
                        if (nuevoTexto != null && !nuevoTexto.trim().isEmpty()) {
                            areaTexto.append("\n" + nuevoTexto);
                        }
                    } else {
                        continuar = false; // Sale del bucle si pulsa "No"
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new App().setVisible(true);
    }
}
