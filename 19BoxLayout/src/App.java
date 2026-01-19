import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ejemplo BoxLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		
		JPanel panel = new JPanel();
		//configuramos el boxLayout, indicamos el panel y orientacion
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		
	//alineacion de los componentes
		boton1.setAlignmentX(Component.LEFT_ALIGNMENT);
		boton2.setAlignmentX(Component.CENTER_ALIGNMENT);
		boton3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
