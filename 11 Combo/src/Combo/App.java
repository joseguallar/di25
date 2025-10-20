package Combo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    public App() {
        
        setTitle("Selección de destino");
        setSize(320, 160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

       
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10, 10, 280, 100);
        panel.setBorder(BorderFactory.createTitledBorder("Elige tu ciudad de destino"));
        add(panel);

        
        String[] ciudades = {"Madrid", "Barcelona", "Valencia", "Sevilla"};
        JComboBox<String> comboCiudades = new JComboBox<>(ciudades);
        comboCiudades.setBounds(60, 35, 150, 25);
        comboCiudades.setToolTipText("Seleccione o escriba una ciudad");
        panel.add(comboCiudades);

      
        comboCiudades.addItem("Zaragoza");           // Añadir nueva ciudad
        comboCiudades.removeItem("Valencia");        // Eliminar una existente
        comboCiudades.setSelectedItem("Sevilla");    // Ciudad por defecto
        comboCiudades.setEditable(true);             // Permitir escribir otra ciudad

     
        comboCiudades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String destino = (String) comboCiudades.getSelectedItem();
                JOptionPane.showMessageDialog(
                    panel,
                    "Has seleccionado como destino: " + destino,
                    "Destino elegido",
                    JOptionPane.INFORMATION_MESSAGE
                ); 
           }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
