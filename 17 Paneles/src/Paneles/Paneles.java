package Paneles;
import javax.swing.*;                        // Importa todas las clases del paquete Swing
import javax.swing.event.*;                  // Importa clases de eventos de Swing
import java.awt.*;                           // Importa clases AWT (Layouts, contenedores, etc)

public class Paneles extends JFrame {
    private JSlider slider;                   // Declaración del componente JSlider
    private JSpinner spinner;                 // Declaración del componente JSpinner
    private JCheckBox modoEspecial;           // Declaración del componente JCheckBox
    private JLabel labelValorSlider;          // Etiqueta para mostrar valor del slider

    public Paneles() {
        super("Selector de parámetros y activador de modo");  // Título de la ventana
        initUI();                                            // Llama a método de inicialización
    }

    private void initUI() {
        Container content = this.getContentPane();           // Obtiene el panel de contenido del frame
        content.setLayout(null);                             // Establece layout null (posición absoluta)

        // Crear panel superior
        JPanel panelArriba = new JPanel();                   // Panel contenedor para la parte superior
        panelArriba.setLayout(null);                         // Layout null también en este panel
        panelArriba.setBounds(0, 0, 400, 140);               // Posición y tamaño del panel superior (x=0,y=0,ancho=400,alto=140)

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // Crear slider horizontal de 0 a 100, valor inicial 50
        slider.setBounds(50, 40, 300, 50);                   // Posición y tamaño del slider en el panel
        slider.setMajorTickSpacing(20);                      // Intervalo mayor de marcas cada 20 unidades
        slider.setMinorTickSpacing(5);                       // Intervalo menor de marcas cada 5 unidades
        slider.setPaintTicks(true);                           // Mostrar marcas de ticks
        slider.setPaintLabels(true);                          // Mostrar etiquetas de valor
        labelValorSlider = new JLabel("Valor: 50");          // Crear etiqueta con valor inicial “Valor: 50”
        labelValorSlider.setBounds(160, 100, 100, 20);       // Posición y tamaño de la etiqueta
        panelArriba.add(slider);                              // Añadir slider al panel superior
        panelArriba.add(labelValorSlider);                     // Añadir etiqueta al panel superior

        // Listener para el slider: cuando su valor cambie, actualiza la etiqueta
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int valor = slider.getValue();                // Obtener el valor actual del slider
                labelValorSlider.setText("Valor: " + valor); // Actualizar el texto de la etiqueta
            }
        });

        // Crear panel inferior
        JPanel panelAbajo = new JPanel();                    // Panel contenedor para la parte inferior
        panelAbajo.setLayout(null);                          // Layout null en este panel
        panelAbajo.setBounds(0, 140, 400, 160);              // Posición y tamaño del panel inferior (x=0,y=140, ancho=400, alto=160)

        spinner = new JSpinner(new SpinnerNumberModel(5, 1, 10, 1));  // Spinner de 1 a 10, valor inicial 5
        spinner.setBounds(50, 40, 60, 30);                             // Posición y tamaño del spinner en el panel
        panelAbajo.add(spinner);                                       // Añadir spinner al panel inferior

        modoEspecial = new JCheckBox("Modo especial");       // Checkbox para activar o desactivar modo especial
        modoEspecial.setBounds(130, 40, 120, 30);             // Posición y tamaño del checkbox
        panelAbajo.add(modoEspecial);                          // Añadir checkbox al panel inferior

        JButton botonAplicar = new JButton("Aplicar");        // Botón para aplicar la selección
        botonAplicar.setBounds(260, 40, 100, 30);             // Posición y tamaño del botón
        panelAbajo.add(botonAplicar);                          // Añadir botón al panel inferior

        // Listener para el botón: al pulsar, lee valores y muestra un diálogo
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                int valorSlider = slider.getValue();           // Leer valor del slider
                int valorSpinner = (int) spinner.getValue();   // Leer valor del spinner
                boolean modoOn = modoEspecial.isSelected();    // Leer estado del checkbox
                String estadoModo = modoOn ? "ON" : "OFF";     // Convertir estado booleano a texto
                JOptionPane.showMessageDialog(Paneles.this,
                    "Valor slider = " + valorSlider
                    + "\nValor spinner = " + valorSpinner
                    + "\nModo especial = " + estadoModo,
                    "Resumen de selección",
                    JOptionPane.INFORMATION_MESSAGE);          // Mostrar diálogo con la información
            }
        });

        content.add(panelArriba);                               // Añadir panel superior al contenedor principal
        content.add(panelAbajo);                                // Añadir panel inferior al contenedor principal

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Hacer que cerrar la ventana termine la aplicación
        this.setSize(400, 300);                                // Tamaño de la ventana principal: ancho=400, alto=300
        this.setLocationRelativeTo(null);                      // Centrar la ventana en la pantalla
    }

    public static void main(String[] args) {
        Paneles frame = new Paneles(); // Crear instancia de ventana
        frame.setVisible(true);                                      // Hacer visible la ventana
    }
}
