package JTable;

import javax.swing.*;                      // Componentes básicos de Swing (JFrame, JTable, JScrollPane...)
import javax.swing.table.DefaultTableModel; // Para manejar la tabla mediante un modelo de datos
import java.awt.*;                         // Para gestionar el diseño y colores (LayoutManagers, Color, etc.)


public class AppJTable extends JFrame {

   
    public AppJTable() {
        
        setTitle("Ejemplo con JTable y clase JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setLayout(null);

       // Nombres de las columnas
        String[] columnas = {"Nombre", "Edad", "Ciudad"};

        // Datos que aparecerán en la tabla
        Object[][] datos = {
            {"Ana", 23, "Madrid"},
            {"Luis", 30, "Barcelona"},
            {"María", 19, "Valencia"},
            {"Juan", 27, "Sevilla"}
        };

        // Creamos un modelo de tabla con los datos y las columnas
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        // Creamos la JTable usando el modelo anterior
        JTable tabla = new JTable(modelo);
        // Ajustamos la altura de cada fila
        tabla.setRowHeight(25);
        // Color de las líneas de la cuadrícula
        tabla.setGridColor(Color.GRAY);
        // Indicamos que queremos que se muestren las líneas de la cuadrícula
        tabla.setShowGrid(true);
        // Permitimos seleccionar solo una fila a la vez
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

       // Insertamos la tabla dentro de un JScrollPane (añade barras de desplazamiento y cabecera)
        JScrollPane scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(15, 25, 450, 120);
        // Añadimos el JScrollPane (con la tabla dentro) al centro del BorderLayout
        add(scrollPane);
        
        JLabel titulo = new JLabel("Listado de Personas");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(170, 5, 200, 20);
        add(titulo);
    }

    // Método main: punto de entrada del programa
    public static void main(String[] args) {
       
           AppJTable ventana = new AppJTable();

           
            ventana.setVisible(true);
        };
    }
