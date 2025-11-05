package Jmenu;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AppMenu {
    public static void main(String[] args) {
        new VentanaMenu().setVisible(true);
    }
}

class VentanaMenu extends JFrame {

    private JMenuBar barraMenu;
    private JMenu menuArchivo, menuEdicion, menuHerramientas, menuAyuda, submenuExportar;
    private JMenuItem itemNuevo, itemAbrir, itemGuardar, itemSalir;
    private JMenuItem itemCopiar, itemPegar;
    private JMenuItem itemColorFondo;
    private JMenuItem itemAcercaDe;

    public VentanaMenu() {
        setTitle("Gestor de Menús Avanzado - TechManager S.L.");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        barraMenu = new JMenuBar();

        // =======================
        // 🔸 MENÚ ARCHIVO
        // =======================
        menuArchivo = new JMenu("Archivo");
        menuArchivo.setMnemonic('A');

        itemNuevo = new JMenuItem("Nuevo", escalarIcono("iconos/nuevo.jpg", 24, 24));
        itemNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        itemAbrir = new JMenuItem("Abrir...", escalarIcono("iconos/abrir.jpg", 24, 24));
        itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        itemGuardar = new JMenuItem("Guardar", escalarIcono("iconos/guardar.png", 24, 24));
        itemGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        itemSalir = new JMenuItem("Salir", escalarIcono("iconos/salir.jpg", 24, 24));
        itemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));

        submenuExportar = new JMenu("Exportar");
        JMenuItem itemPDF = new JMenuItem("Exportar a PDF");
        JMenuItem itemExcel = new JMenuItem("Exportar a Excel");
        JMenuItem itemImagen = new JMenuItem("Exportar a Imagen");

        submenuExportar.add(itemPDF);
        submenuExportar.add(itemExcel);
        submenuExportar.add(itemImagen);

        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(submenuExportar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        // =======================
        // 🔸 MENÚ EDICIÓN
        // =======================
        menuEdicion = new JMenu("Edición");
        menuEdicion.setMnemonic('E');

        itemCopiar = new JMenuItem("Copiar");
        itemPegar = new JMenuItem("Pegar");
        itemCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        itemPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        menuEdicion.add(itemCopiar);
        menuEdicion.add(itemPegar);

        // =======================
        // 🔸 MENÚ HERRAMIENTAS
        // =======================
        menuHerramientas = new JMenu("Herramientas");
        menuHerramientas.setMnemonic('H');

        itemColorFondo = new JMenuItem("Cambiar color de fondo");
        menuHerramientas.add(itemColorFondo);

        // =======================
        // 🔸 MENÚ AYUDA
        // =======================
        menuAyuda = new JMenu("Ayuda");
        menuAyuda.setMnemonic('Y');

        itemAcercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(itemAcercaDe);

        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);
        barraMenu.add(menuHerramientas);
        barraMenu.add(menuAyuda);
        setJMenuBar(barraMenu);

        // =======================
        // 🔹 ACCIONES DE MENÚ (sin lambdas)
        // =======================
        itemNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Nuevo archivo creado.");
            }
        });
        
        itemAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Abriendo archivo existente...");
            }
        });

        itemGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Archivo guardado correctamente.");
            }
        });

        itemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salirAplicacion();
            }
        });

        itemPDF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Exportando datos a formato PDF...");
            }
        });

        itemExcel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Exportando datos a formato Excel...");
            }
        });

        itemImagen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Exportando datos a imagen...");
            }
        });

        itemCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Texto copiado al portapapeles.");
            }
        });

        itemPegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Texto pegado desde el portapapeles.");
            }
        });

        itemColorFondo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiarColorFondo();
            }
        });

        itemAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        VentanaMenu.this,
                        "Aplicación desarrollada por TechManager S.L.\nVersión 2.0 - Con atajos e iconos",
                        "Acerca de",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }

    // Método para escalar iconos
    private ImageIcon escalarIcono(String ruta, int ancho, int alto) {
        ImageIcon iconoOriginal = new ImageIcon(ruta);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imagenEscalada);
    }

    private void mostrarMensaje(String texto) {
        JOptionPane.showMessageDialog(this, texto, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cambiarColorFondo() {
        Color nuevoColor = JColorChooser.showDialog(this, "Seleccione un color de fondo", getBackground());
        if (nuevoColor != null) {
            getContentPane().setBackground(nuevoColor);
        }
    }

    private void salirAplicacion() {
        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Desea salir de la aplicación?",
                "Confirmar salida",
                JOptionPane.YES_NO_OPTION
        );
        if (opcion == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
}
