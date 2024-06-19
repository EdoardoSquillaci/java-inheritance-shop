package org.lessons.shop.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone primoSmartphone = new Smartphone("Iphone 14 Pro", "Apple" , 1200d , 22 , "512 GB");
		
		//Primo Telefono
		
        System.out.println("--------Smartphone--------");
		
		System.out.println("Modello: " + primoSmartphone.getNome());
		
		System.out.println("Marchio: " +primoSmartphone.getMarca());
		
        System.out.println("Codice Prodotto: SKU" +primoSmartphone.getcodiceProdotto());

		System.out.println("Prezzo Base: " +primoSmartphone.getPrezzo() + " €");
		
		System.out.println("Prezzo finale con IVA: " +primoSmartphone.prezzoIvaFormattato() + " €");
		
		System.out.println("Codice IMEI: " + "ES" + +primoSmartphone.getCodiceIMEI());
		
		System.out.println("Quantità di memoria: " +primoSmartphone.quantitaMemoria);
		        
        System.out.println("--------Smartphone--------");

      //Secondo Telefono
		
		Smartphone secondoSmartphone = new Smartphone("Iphone 13 Pro", "Apple" , 900d , 22 , "128 GB");

        System.out.println("--------Smartphone--------");
        
        System.out.println("Modello: " + secondoSmartphone.getNome());
        
		System.out.println("Marchio: " +secondoSmartphone.getMarca());
		
        System.out.println("Codice Prodotto: SKU" + secondoSmartphone.getcodiceProdotto());
		
		System.out.println("Prezzo Base: " + secondoSmartphone.getPrezzo() + " €");
		
		System.out.println("Prezzo IVA: " + secondoSmartphone.prezzoIvaFormattato() + " €");
		
		System.out.println("Codice IMEI: " + "ES" + secondoSmartphone.getCodiceIMEI());
		
		System.out.println("Quantità di memoria: " + secondoSmartphone.quantitaMemoria);
		        
        System.out.println("--------Smartphone--------");
		
        
        
        //televisori
        
        
        
        Televisori primoTelevisore = new Televisori("SkyGlass", "Sky" ,1300d, 22 ,  95.25d , 62.86d , 47.7d , true);
        
        
        System.out.println("--------Televisore--------");

        
        System.out.println("Modello: " + primoTelevisore.getNome());

        System.out.println("Marchio: " + primoTelevisore.getMarca());
        
        System.out.println("Codice Prodotto: SKU" + primoTelevisore.getcodiceProdotto());

        System.out.println("Prezzo Base: " + primoTelevisore.getPrezzo() + " €");
        
        System.out.println("Prezzo Finale con IVA: " + primoTelevisore.prezzoIvaFormattato() + " €");
        
        System.out.println("Lunghezza: " + primoTelevisore.getLunghezza());

        System.out.println("Larghezza: " + primoTelevisore.getLarghezza());
        
        System.out.println("Altezza: " + primoTelevisore.getAltezza());        
        
        System.out.println("Il televisore è smart? : " + primoTelevisore.isTelevisoreSmart());

        System.out.println("--------Televisore--------");


Televisori SecondoTelevisore = new Televisori("Sony UltraWide 4K", "Sony" ,6299.9d, 22 ,  1055.25d , 74.86d , 55.7d , true);
        
        
        System.out.println("--------Televisore--------");

        
        System.out.println("Modello: " + SecondoTelevisore.getNome());

        System.out.println("Marchio: " + SecondoTelevisore.getMarca());
        
        System.out.println("Codice Prodotto: SKU" + SecondoTelevisore.getcodiceProdotto());

        System.out.println("Prezzo Base: " +SecondoTelevisore.getPrezzo() + " €");
        
        System.out.println("Prezzo Finale con IVA: " + SecondoTelevisore.prezzoIvaFormattato() + " €");
        
        System.out.println("Lunghezza: " + SecondoTelevisore.getLunghezza());

        System.out.println("Larghezza: " + SecondoTelevisore.getLarghezza());
        
        System.out.println("Altezza: " +SecondoTelevisore.getAltezza());        
        
        System.out.println("Il televisore è smart? : " + SecondoTelevisore.isTelevisoreSmart());

        System.out.println("--------Televisore--------");

// cuffie
        
        System.out.println("--------Cuffie--------");
        
        
        Cuffie primaCuffia = new Cuffie ("Beats Studio pro" , "Beats", 299, 22, "Nere" ,"Wireless" );

        System.out.println("Modello: " + primaCuffia.getNome());

        System.out.println("Marchio " + primaCuffia.getMarca());
        
        System.out.println("Codice Prodotto: SKU" + primaCuffia.getcodiceProdotto());

        System.out.println("Prezzo Base: " + primaCuffia.getPrezzo() + " €");
 
        System.out.println("Prezzo Finale con IVA: " + primaCuffia.prezzoIvaFormattato() + " €");

        System.out.println("Colore " +primaCuffia.getColore());  
        
        System.out.println("Modalità: " + primaCuffia.getModalita());     

        System.out.println("--------Cuffie--------");
        
        
 System.out.println("--------Cuffie--------");
        
        
        Cuffie secondaCuffia = new Cuffie ("Auricolari InEar" , "Apple", 4.91d, 22, "Bianche" ,"Cablate" );

        System.out.println("Modello: " +secondaCuffia.getNome());

        System.out.println("Marchio " + secondaCuffia.getMarca());
        
        System.out.println("Codice Prodotto: SKU" + secondaCuffia.getcodiceProdotto());

        System.out.println("Prezzo Base: " + secondaCuffia.getPrezzo() + " €");
 
        System.out.println("Prezzo Finale con IVA: " + secondaCuffia.prezzoIvaFormattato() + " €");

        System.out.println("Colore " +secondaCuffia.getColore());  
        
        System.out.println("Modalità: " + secondaCuffia.getModalita());     

        System.out.println("--------Cuffie--------");

         
        
	}

}
