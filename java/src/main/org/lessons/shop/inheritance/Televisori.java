package org.lessons.shop.inheritance;

public class Televisori extends Prodotto {
	
	//Televisori, caratterizzati dalle dimensioni
	//e dalla proprietà di essere smart oppure no

    private double lunghezza;
	
	private double altezza;
	
	private double larghezza;
	
	private boolean televisoreSmart;
	

public Televisori(String nome, String marca, double prezzo, int iva, double lunghezza, double larghezza, double altezza, boolean televisoreSmart) {
		super(nome, marca, prezzo, iva);
	
	
	
    this.lunghezza = lunghezza;
		
	this.altezza = altezza ;
	
	this.larghezza = larghezza;

	this.televisoreSmart = televisoreSmart;	
	
	
}


public double getLunghezza() {
	return lunghezza;
}


public void setLunghezza(double lunghezza) {
	this.lunghezza = lunghezza;
}


public double getAltezza() {
	return altezza;
}


public void setAltezza(double altezza) {
	this.altezza = altezza;
}


public double getLarghezza() {
	return larghezza;
}


public void setLarghezza(double larghezza) {
	this.larghezza = larghezza;
}


public boolean isTelevisoreSmart() {
	return televisoreSmart;
}


public void setTelevisoreSmart(boolean televisoreSmart) {
	this.televisoreSmart = televisoreSmart;
}












     

}
