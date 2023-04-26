package Esercizio2;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BarraStrumenti extends JPanel implements ActionListener{
	
	private JButton bottoneBuongiorno;
	private JButton bottoneBuonasera;
	private TextListener textListener;
	
	BarraStrumenti() {
		bottoneBuongiorno = new JButton("Buongiorno");
		bottoneBuonasera = new JButton("Buonasera");
		
		bottoneBuongiorno.addActionListener(this);
		bottoneBuonasera.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(bottoneBuongiorno);
		add(bottoneBuonasera);
	}
	
	
	public void setTextListener(TextListener textListener) {
		this.textListener = textListener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton premuto = (JButton) e.getSource();
		
		
		if (premuto == bottoneBuongiorno) {
			textListener.testoEmesso("Buongiorno \n");
		} else if (premuto == bottoneBuonasera) {
			textListener.testoEmesso("Buonasera \n");
		}
		
	}
	
	
}