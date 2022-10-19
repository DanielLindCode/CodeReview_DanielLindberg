package com.company;

public class Main {

	public static void main(String[] args) {

		Bank b1 = new Bank("Wallenbergs grovslakt och bank");

		// Jag f�rstod vad som var meningen med klassen MockData men k�nner att den �r
		// �verfl�dig i detta project.
//		MockData.LoadCustomersAndAccounts();
//		var Customers = MockData.Customers;

		// Skapar en kund
		Customer c1 = new Customer(19880622L, "Pelle Plutt");
		
		
		

		// Provar de olika metoder kundklassen har
//		System.out.println(c1.getFullName());
//		System.out.println(c1.getPNr());
//		System.out.println(c1.getAccountList());
		c1.addAccount(c1.getPNr());
		c1.addAccount(c1.getPNr());
		c1.addAccount(c1.getPNr());
		// Metoden skriver ut en lista med Accountsobjekt. Kanske skulle finnas en metod
		// som skriver ut alla konton i String.
		System.out.println(c1.getAccountList());

		// Vi kan n� kontona p� detta s�tt
//		System.out.println("---------------------------------------");
//		System.out.println(c1.getAccountList().get(0).getPNr());
//		System.out.println(c1.getAccountList().get(0).getAccountID());
//		System.out.println(c1.getAccountList().get(0).getBalance());
//		System.out.println("---------------------------------------");
//		System.out.println(c1.getAccountList().get(1).getPNr());
//		System.out.println(c1.getAccountList().get(1).getAccountID());
//		System.out.println(c1.getAccountList().get(1).getBalance());
//		System.out.println("---------------------------------------");
//		System.out.println(c1.getAccountList().get(2).getPNr());
//		System.out.println(c1.getAccountList().get(2).getAccountID());
//		System.out.println(c1.getAccountList().get(2).getBalance());
//		System.out.println("---------------------------------------");

		
		c1.closeAccount(c1.getPNr(), c1.getAccountList().get(0).getAccountID());

		System.out.println(c1.getAccountList());
		
		//Jag hade nog satt en long eller en double ist f�r int p� amount.
		c1.depositMoney(c1.getPNr(), c1.getAccountList().get(0).getAccountID(), 5000.0);
		System.out.println("---------------------------------------");
		System.out.println(c1.getAccountList().get(0).getBalance());
		System.out.println("---------------------------------------");
		
		//Denna metoden borde kanske vara privat.
		//Det ser heller inte ut som att den fungerar som den ska.
		//F�r att f� ut indexet av ett konto s� m�ste du ha kontots ID som parameter.
		//F�r att f� tag p� ID s� m�ste du ange vilket index av kontona du vill f� IDt till.
		//Jag vet inte om det �r det b�sta s�ttet att g�ra detta p� men det k�nns inte r�tt.
		
		System.out.println(c1.getAccountIndex(c1.getAccountList().get(0).getAccountID()));
		
		//F�rs�ker breaka kundklassen
		
		Customer c2 = new Customer(25, null);
	
		System.out.println(c2.getFullName());
		System.out.println(c2.getPNr());
		//F�r error p� denna metoden. Finns inget skydd f�r fel parametrar
		//c2.closeAccount(c2.getPNr(), c2.getAccountList().get(0).getAccountID());
		//System.out.println(c2.getAccountList().get(0).getBalance());
		
		//Finns redan en metod med samma namn i kundklassen
		System.out.println(b1.addAccount(c1.getPNr(), c1.getAccountList().get(0).getAccountID()));
		
		//Fungerar
		b1.writeCustomersToTxt();
		
		//F�rst�r inte meningen h�r.
		b1.AddCustomer(c1.getPNr(), "Fisk");
		
		System.out.println(b1.getCustomerList());

//		
//		b1.AddCustomer(c1.getPNr(), c1.getFullName());
//		
//
		var customerInfo = b1.GetCustomer(c1.getPNr());
//
		System.out.println(customerInfo);

	}
}
