package Esercizio2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Frame extends JFrame {
	
	private TextAreaPanel textAreaPanel;
	private BarraStrumenti barraStrumenti;
	private PannelloForm pannelloForm;
	

	public Frame() {
		
		super("Modulo Cinema");
		
		setLayout(new BorderLayout());
		
		barraStrumenti = new BarraStrumenti();
		textAreaPanel = new TextAreaPanel();
		pannelloForm = new PannelloForm();

		
		barraStrumenti.setTextListener(new TextListener() {
			@Override
			public void testoEmesso(String testo) {
				textAreaPanel.appendiTesto(testo);
			}
		});
		
		pannelloForm.setFormListener(new FormListener() {

			@Override
			public void formEventListener(FormEvent fe) {
				String film = fe.getFilm();
				String ora = fe.getOra();
				boolean seleziona = fe.isSeleziona();
				String posti = fe.getPosti();
				
				textAreaPanel.appendiTesto("film: " + film + "\nora: " + ora + "\nSeleziona: " + seleziona + "\nPosti: " + posti + "\n");
			}	
		});
		
		
		add(textAreaPanel, BorderLayout.CENTER);
		add(barraStrumenti, BorderLayout.PAGE_START);
		add(pannelloForm, BorderLayout.LINE_START);
		
		setSize(800, 500);
		//setLocation(200,200);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
