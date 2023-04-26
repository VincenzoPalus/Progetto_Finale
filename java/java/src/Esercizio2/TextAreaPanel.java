package Esercizio2;


import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class TextAreaPanel extends JPanel{
	
	private JTextArea textArea;
	
	public TextAreaPanel() {
		
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		
		
	}
	
	public void appendiTesto(String testo) {
		
		textArea.append(testo);
	}

}
