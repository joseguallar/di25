package JSpinner;
import javax.swing.*;              
import java.awt.event.*;   
        
public class AppSpiner extends JFrame { 
    private JSpinner spinner;        // Campo de clase: selector numérico (JSpinner)
    private JButton boton;           
    public AppSpiner() {  
    	super("Ejemplo con JSpinner");                      // Llama al constructor de JFrame con el título de la ventana
        initUI();                                           // Método que inicializa la interfaz de usuario
    }

    private void initUI() {                                 // Método para configurar los componentes de la interfaz
        JPanel panel = new JPanel();            
        panel.setLayout(null);           
        SpinnerNumberModel model = new SpinnerNumberModel(5, 0, 10, 1);
        // Crear un modelo numérico para el JSpinner:
        // valor inicial 5, mínimo 0, máximo 10, incremento 1
        spinner = new JSpinner(model);                      // Crear el JSpinner con el modelo definido
        spinner.setBounds(50, 40, 60, 30);                  // Establecer posición (x=50,y=40) y tamaño (ancho=60, alto=30)
        ((JSpinner.DefaultEditor) spinner.getEditor())
            .getTextField().setHorizontalAlignment(JTextField.CENTER);
        // Obtener el editor interno del spinner, acceder al campo de texto y centrar el texto del número
        spinner.setToolTipText("Número del 0 al 10");       // Configurar texto emergente que aparece al pasar el ratón sobre el spinner
        panel.add(spinner);                                
        boton = new JButton("Leer valor");                      
        boton.setBounds(130, 40, 100, 30);      
        panel.add(boton);                                   
        boton.addActionListener(new ActionListener() {       // Asociar un listener para cuando se pulse el botón
            @Override
            public void actionPerformed(ActionEvent e) {     // Método que se ejecuta al pulsar el botón
                int nuevoValor = (int) spinner.getValue() + 1;
                // Obtener valor actual del spinner (convertido a int) y añadir 1
                spinner.setValue(nuevoValor);                  // Establecer el nuevo valor en el spinner
                Object valor = spinner.getValue();             // Obtener el valor actualizado del spinner
                JOptionPane.showMessageDialog(AppSpiner.this,
                    "Valor del JSpinner: " + valor,
                    "Información",
                    JOptionPane.INFORMATION_MESSAGE);
                // Mostrar un diálogo de información al usuario con el valor del spinner
            }
        });

        this.add(panel);                                     // Añadir el panel a la ventana (JFrame)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer que cerrar la ventana termine la aplicación
        this.setSize(300, 150);                              // Definir tamaño de la ventana: ancho=300, alto=150
        this.setLocationRelativeTo(null);                    // Centrar la ventana en la pantalla (null = centro relativo a ningún componente)
    }

    public static void main(String[] args) {                 // Método principal (punto de entrada) de la aplicación
        AppSpiner ex = new AppSpiner(); // Instanciar la clase ventana
        ex.setVisible(true);                                 // Hacer visible la ventana
    }
}
