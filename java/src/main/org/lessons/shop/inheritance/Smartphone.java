package org.lessons.shop.inheritance;

import java.util.Random;

public class Smartphone extends Prodotto {
	//Smarphone, caratterizzati anche dal codice IMEI
	//e dalla quantità di memoria
	 
	
	 int codiceIMEI;
	
	 String quantitaMemoria;
	 
	public Smartphone(String nome, String marca, double prezzo, int iva,String quantitaMemoria) {
		super(nome, marca, prezzo, iva);
		
		
		int valoreMassimoCodice = 999999999;
		
		
		int valoreMinimoCodice = 222222222;

		Random codiceIMEIRandomico = new Random();
		
		
		this.codiceIMEI = codiceIMEIRandomico.nextInt(valoreMassimoCodice - valoreMinimoCodice);
		 
		this.quantitaMemoria= quantitaMemoria;
	
	}

	public int getCodiceIMEI() {
		return codiceIMEI;
	}
	
	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public String getquantitaMemoria() {
		return quantitaMemoria;
	}
	
	public void setquantitaMemoria(String quantitaMemoria) {
		this.quantitaMemoria = quantitaMemoria;
	}

}
