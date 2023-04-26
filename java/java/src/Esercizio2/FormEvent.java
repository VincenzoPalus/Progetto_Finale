package Esercizio2;

import java.util.EventObject;

public class FormEvent extends EventObject{
	
	private String film;
	private String ora;
	private boolean seleziona;
	private String posti;

	public FormEvent(Object source) {
		super(source);
	}

	public FormEvent(Object source, String film, String ora) {
		super(source);
		this.film = film;
		this.ora = ora;
	}

	public FormEvent(Object source, String film, String ora, boolean seleziona, String posti) {
		super(source);
		this.film = film;
		this.ora = ora;
		this.seleziona = seleziona;
		this.posti = posti;
	}

	public boolean isSeleziona() {
		return seleziona;
	}

	public void setSeleziona(boolean seleziona) {
		this.seleziona = seleziona;
	}

	public String getPosti() {
		return posti;
	}

	public void setPosti(String posti) {
		this.posti = posti;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public String getOra() {
		return ora;
	}

	public void setOra(String ora) {
		this.ora = ora;
	}

}
