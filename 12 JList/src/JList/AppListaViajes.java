package JList;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

// Clase principal que lanza la aplicación
public class AppListaViajes {
    public static void main(String[] args) {
        VentanaLista ventana = new VentanaLista();
        ventana.setVisible(true);
    }
}

// Clase que representa la ventana principal
class VentanaLista extends JFrame {

    private JList<String> listaDestinos;
    private JPanel panelPrincipal;

    public VentanaLista() {
        setTitle("Selección de destinos - ViajaFácil");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // Centrar ventana

        // Crear y configurar el panel principal
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setBounds(10, 10, 310, 180);
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Destinos disponibles"));
        add(panelPrincipal);

        // Lista de destinos
        String[] destinos = {"París", "Roma", "Londres", "Tokio", "Nueva York", "Sídney", 
                             "Atenas", "Berlín", "Madrid", "Buenos Aires", "Lisboa", "Praga"};
        listaDestinos = new JList<>(destinos);
        listaDestinos.setFont(new Font("Arial", Font.PLAIN, 14));
        listaDestinos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Crear un JScrollPane para la lista
        JScrollPane scroll = new JScrollPane(listaDestinos);
        scroll.setBounds(30, 30, 250, 100);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panelPrincipal.add(scroll);

        // Listener para mostrar mensaje al seleccionar destino
        listaDestinos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && !listaDestinos.isSelectionEmpty()) {
                    String destinoSeleccionado = listaDestinos.getSelectedValue();
                    JOptionPane.showMessageDialog(
                        VentanaLista.this,
                        "Has seleccionado el destino: " + destinoSeleccionado,
                        "Destino seleccionado",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });
    }
}
