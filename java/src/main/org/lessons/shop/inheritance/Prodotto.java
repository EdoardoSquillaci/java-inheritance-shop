package org.lessons.shop.inheritance;

import java.util.Random;

//Un prodotto è caratterizzato da:
//codice (numero intero) accessibile solo in lettura
//nome
//marca
//prezzo
//iva

public class Prodotto {

	private int codiceProdotto;

	private String nome;

	private String marca;

	private double prezzo;

	private int iva;
	

	public Prodotto(String nome,String marca, double prezzo ,int iva) {
		
	    int valoreMinimo = 11111;
		
		int valoreMassimo = 99999;
		
	    Random codiceRandom = new Random();
		 
	    this.codiceProdotto = codiceRandom.nextInt(valoreMassimo - valoreMinimo);	
		this.nome=nome;
		this.marca=marca;
		this.prezzo=prezzo;
		this.iva=iva;
	}


	public int getcodiceProdotto() {
		return codiceProdotto;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	public double prezzoIva() {
		
		double prezzoIva = prezzo + (prezzo * iva)/100;
		
		return prezzoIva;
		
	}
	
	public String prezzoIvaFormattato() {
        return String.format("%.2f", prezzoIva());
    }
	
}
