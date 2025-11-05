package JSlider;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class AppJSlider extends JFrame{

	public AppJSlider () {
		
		JPanel panel = new JPanel();
		
	setTitle("Ejemplo con JSlider");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 150);
    setLayout(null);
    
    
    panel.setLayout(null);
    panel.setBounds(0, 0, 400, 150);
    panel.setBorder(BorderFactory.createTitledBorder("Detalle de la Reserva"));
    
	        // Crear JSlider horizontal de 0 a 50
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setBounds(50, 40, 300, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panel.add(slider);
       add(panel);

        // ChangeListener para mostrar el valor actual
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int valor = slider.getValue();
                System.out.println("Valor del slider: " + valor);
            }
        });
	}
        public static void main(String[] args) {
        	
        	AppJSlider ventana = new AppJSlider();
        	ventana.setVisible(true);
    }
}
