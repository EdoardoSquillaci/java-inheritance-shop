package org.lessons.shop.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone primoSmartphone = new Smartphone("Iphone 14 Pro", "Apple" , 1200d , 22 , "512 GB");
		
		//Primo Telefono
		
		System.out.println("Modello: " + primoSmartphone.getNome());
		System.out.println("Marchio: " +primoSmartphone.getMarca());
		System.out.println("Prezzo Base: " +primoSmartphone.getPrezzo());
		System.out.println("Prezzo IVA: " +primoSmartphone.prezzoIva());
		System.out.println("Codice IMEI: " + "ES" + +primoSmartphone.getCodiceIMEI());
		System.out.println("Quantità di memoria: " +primoSmartphone.quantitaMemoria);
        System.out.println("Codice Prodotto: SKU" +primoSmartphone.getcodiceProdotto());
        System.out.println("--------------------------------------");

      //Secondo Telefono
		
		Smartphone secondoSmartphone = new Smartphone("Iphone 13 Pro", "Apple" , 900d , 22 , "128 GB");

        
        System.out.println("Modello: " + secondoSmartphone.getNome());
		System.out.println("Marchio: " +secondoSmartphone.getMarca());
		System.out.println("Prezzo Base: " + secondoSmartphone.getPrezzo());
		System.out.println("Prezzo IVA: " + secondoSmartphone.prezzoIva());
		System.out.println("Codice IMEI: " + "ES" + secondoSmartphone.getCodiceIMEI());
		System.out.println("Quantità di memoria: " + secondoSmartphone.quantitaMemoria);
        System.out.println("Codice Prodotto: SKU" + secondoSmartphone.getcodiceProdotto());
        System.out.println("--------------------------------------");
		
        
        
        //televisori
	}

}
