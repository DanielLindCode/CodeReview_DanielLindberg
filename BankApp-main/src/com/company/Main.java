package com.company;

public class Main {

	public static void main(String[] args) {

		Bank b1 = new Bank("Wallenbergs grovslakt och bank");

		// Jag förstod vad som var meningen med klassen MockData men känner att den är
		// överflödig i detta project.
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

		// Vi kan nå kontona på detta sätt
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
		
		//Jag hade nog satt en long eller en double ist för int på amount.
		c1.depositMoney(c1.getPNr(), c1.getAccountList().get(0).getAccountID(), 5000.0);
		System.out.println("---------------------------------------");
		System.out.println(c1.getAccountList().get(0).getBalance());
		System.out.println("---------------------------------------");
		
		//Denna metoden borde kanske vara privat.
		//Det ser heller inte ut som att den fungerar som den ska.
		//För att få ut indexet av ett konto så måste du ha kontots ID som parameter.
		//För att få tag på ID så måste du ange vilket index av kontona du vill få IDt till.
		//Jag vet inte om det är det bästa sättet att göra detta på men det känns inte rätt.
		
		System.out.println(c1.getAccountIndex(c1.getAccountList().get(0).getAccountID()));
		
		//Försöker breaka kundklassen
		
		Customer c2 = new Customer(25, null);
	
		System.out.println(c2.getFullName());
		System.out.println(c2.getPNr());
		//Får error på denna metoden. Finns inget skydd för fel parametrar
		//c2.closeAccount(c2.getPNr(), c2.getAccountList().get(0).getAccountID());
		//System.out.println(c2.getAccountList().get(0).getBalance());
		
		//Finns redan en metod med samma namn i kundklassen
		System.out.println(b1.addAccount(c1.getPNr(), c1.getAccountList().get(0).getAccountID()));
		
		//Fungerar
		b1.writeCustomersToTxt();
		
		//Förstår inte meningen här.
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
