import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("CardLayout");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(3);
		frame.setSize(300, 200);
		frame.setLayout(new BorderLayout());
		
		// creamos el panel
		JPanel panel = new JPanel();
		CardLayout	cardLayout = new CardLayout();
		panel.setLayout(cardLayout);
		
		// crar "tarjetas" o componentes
		
		JPanel card1 = new JPanel();
		card1.setBorder(BorderFactory.createLineBorder(Color.RED));
		card1.add(new JLabel("Tarjeta 1"));
		
		JPanel card2 = new JPanel();
		card2.add(new JButton("Tarjeta 2"));
		card2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		JPanel card3 = new JPanel();
		card3.add(new JLabel("Tarjeta 3"));
		card3.setBorder(BorderFactory.createLineBorder(Color.BLUE));				
		//agrego las "tarjetas al panel
		panel.add(card1,"tarjeta 1");
		panel.add(card2,"tarjeta 2");
		panel.add(card3,"tarjeta 3");
		
		//botones para cambiar de tarjetas
		
		JPanel panelBotones = new JPanel();
		JButton btnPrevio = new JButton("Anterior");
		JButton btnSiguiente = new JButton("Siguiente");
		
		panelBotones.add(btnPrevio);
		panelBotones.add(btnSiguiente);
		//panelBotones.setPreferredSize(new Dimension(100,30));
		btnPrevio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(panel);
			}
		});
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			cardLayout.next(panel);	
			}
		});
		frame.add(panel,BorderLayout.CENTER);
		frame.add(panelBotones,BorderLayout.SOUTH);
		frame.setVisible(true);
	}

}
