package org.lessons.shop.inheritance;

public class Cuffie extends Prodotto {
	
	//Cuffie, caratterizzate dal colore e se sono wireless o cablate

	
	 private String colore;
	
	 private String modalita;
	
	


	public Cuffie(String nome, String marca, double prezzo, int iva, String colore, String modalita) {
		super(nome, marca, prezzo, iva);

	
	
	this.colore = colore;
	
	this.modalita = modalita;
	
	
	
	
	
	}
	
	public String getColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getModalita() {
		
		return modalita;
	}


	public void setModalita(String modalita) {
		this.modalita = modalita;
	}


}
