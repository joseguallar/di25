package JTextArea;

import javax.swing.*;
import java.awt.*;

public class EjJTextArea extends JFrame {
    private JTextArea areaTexto;

    public EjJTextArea() {
        setTitle("Información de Reserva de Viaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 300);
        setLayout(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 380, 240);
        panel.setBorder(BorderFactory.createTitledBorder("Detalle de la Reserva"));
        add(panel);

        // Crear JTextArea con texto inicial (simulación de reserva)
        areaTexto = new JTextArea("Pasajero: Ana López\n"
                                + "Destino: Roma, Italia\n"
                                + "Vuelo: AZ678 - 15/11/2025\n"
                                + "Hotel: Roma Plaza\n"
                                + "Estado de la reserva: Confirmada");
        areaTexto.setBounds(20, 30, 340, 180);
        areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 12));
        areaTexto.setForeground(Color.DARK_GRAY);
        //areaTexto.setBackground(Color.LIGHT_GRAY);
        areaTexto.setLineWrap(true);       // Ajuste automático de línea
        areaTexto.setWrapStyleWord(true);  // No cortar palabras
        areaTexto.setEditable(false);  
        areaTexto.setRows(5);
        areaTexto.setColumns(20);
        //si queremos añadir un scroll es con jscrollpanel
        panel.add(areaTexto);

        // Añadir más información con append (como si fueran notas de la agencia)
        areaTexto.append("\n\nNotas adicionales:");
        areaTexto.append("\n- Traslado al hotel incluido.");
        areaTexto.append("\n- Check-in a partir de las 14:00.");
      
    }

    public static void main(String[] args) {
        new EjJTextArea().setVisible(true);
    }
}
