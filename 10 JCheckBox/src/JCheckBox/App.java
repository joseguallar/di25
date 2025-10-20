package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    
    public App() {
        setTitle("Preferencias de Notificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

       
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder("Opciones de usuario"));
        panel.setBounds(30, 30, 320, 120);

        
        JCheckBox chkNotificaciones = new JCheckBox("Recibir notificaciones");
        chkNotificaciones.setBounds(40, 40, 200, 25);
        chkNotificaciones.setFont(new Font("Arial", Font.PLAIN, 14));
        chkNotificaciones.setToolTipText("Activa para recibir avisos de la aplicación");
        chkNotificaciones.setSelected(true);
        panel.add(chkNotificaciones);

      
        JCheckBox chkEmail = new JCheckBox("Recibir notificaciones por correo");
        chkEmail.setBounds(60, 70, 250, 25);
        chkEmail.setFont(new Font("Arial", Font.PLAIN, 14));
        chkEmail.setToolTipText("Opción disponible solo si están activadas las notificaciones");
        chkEmail.setEnabled(true);
        panel.add(chkEmail);

       
        JButton btnGuardar = new JButton("Guardar preferencias");
        btnGuardar.setBounds(100, 170, 200, 30);
        btnGuardar.setFont(new Font("Arial", Font.BOLD, 13));

      
        chkNotificaciones.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
        boolean activo = chkNotificaciones.isSelected();
        chkEmail.setEnabled(activo);
        if (!activo) chkEmail.setSelected(false);
    }
});           
        
        btnGuardar.addActionListener(e -> {
            String mensaje;
            if (!chkNotificaciones.isSelected()) {
                mensaje = "Has desactivado todas las notificaciones.";
            } else {
                mensaje = "Notificaciones activadas.";
                mensaje += chkEmail.isSelected()
                        ? "\nTambién recibirás correos electrónicos."
                        : "\nNo recibirás correos electrónicos.";
            }
            JOptionPane.showMessageDialog(this, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        });

        
        add(panel);
        add(btnGuardar);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
