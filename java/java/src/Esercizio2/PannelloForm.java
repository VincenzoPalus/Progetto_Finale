package Esercizio2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PannelloForm extends JPanel {
	
	private JLabel labelFilm;
	private JLabel labelOra;
	
	private JTextField fieldFilm;
	private JTextField fieldOra;
	
	private JLabel labelSeleziona;
	private JCheckBox checkSeleziona;
	
	private JLabel labelPosti;
	private JTextField fieldPosti;
	
	private JButton bottoneAggiungi;
	
	private FormListener formListener;
	
	PannelloForm() {
		setPreferredSize(new Dimension(300,100));
		setLayout(new GridBagLayout());
		
		//Bordi
		Border bordoInterno = BorderFactory.createTitledBorder("Aggiungi Film");
		Border bordoEsterno = BorderFactory.createEmptyBorder(0, 5, 5, 5);
		Border bordoFinale = BorderFactory.createCompoundBorder(bordoEsterno, bordoInterno);
		
		setBorder(bordoFinale);
		
		//film
		labelFilm = new JLabel("Film:");
		fieldFilm = new JTextField(15);
		
		//ora
		labelOra = new JLabel("Ora:");
		fieldOra = new JTextField(15);
		
		//Selezione e posti
		labelSeleziona = new JLabel("Seleziona Posti");
		checkSeleziona = new JCheckBox();
		
		labelPosti = new JLabel("Posti");
		fieldPosti = new JTextField(15);
		
		labelPosti.setEnabled(false);
		fieldPosti.setEnabled(false);
		
		checkSeleziona.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean selezione = checkSeleziona.isSelected();
				
				labelPosti.setEnabled(selezione);
				fieldPosti.setEnabled(selezione);
				
				if(!selezione) fieldPosti.setText("");
			}
			
		});
		
		//bottone
		bottoneAggiungi = new JButton("Aggiungi!");
		
		bottoneAggiungi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String film = fieldFilm.getText();	
				String ora = fieldOra.getText();
				boolean seleziona = checkSeleziona.isSelected();
				String posti = fieldPosti.getText();
				
				FormEvent formEvent = new FormEvent(this, film, ora, seleziona , posti);
				
				if(formListener != null) {
					formListener.formEventListener(formEvent);
				}
			}
		});
		
		//Layout
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_END;
		
		gbc.insets = new Insets(0, 0, 0, 5);
		
		add(labelFilm, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		gbc.insets = new Insets(0, 0, 0, 0);
		
		add(fieldFilm, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_END;
		
		gbc.insets = new Insets(0, 0, 0, 5);
		
		add(labelOra, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		gbc.insets = new Insets(0, 0, 0, 0);
		
		add(fieldOra, gbc);
		
		 //lavel vendita
		gbc.gridx = 0;
		gbc.gridy = 2;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_END;
		
		gbc.insets = new Insets(0, 0, 0, 5);
		
		add(labelSeleziona, gbc);
		
		//checkbox seleziona
		gbc.gridx = 1;
		gbc.gridy = 2;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		gbc.insets = new Insets(0, 0, 0, 0);
		
		add(checkSeleziona, gbc);
		  //posti
		gbc.gridx = 0;
		gbc.gridy = 3;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_END;
		
		gbc.insets = new Insets(0, 0, 0, 5);
		
		add(labelPosti, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		
		gbc.weightx = 0.01;
		gbc.weighty = 0.01;
		
		gbc.anchor = GridBagConstraints.LINE_START;
		
		gbc.insets = new Insets(0, 0, 0, 0);
		
		add(fieldPosti, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		
		gbc.anchor = GridBagConstraints.PAGE_START;
		
		add(bottoneAggiungi, gbc);
		
	}
	
	
	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}
}
