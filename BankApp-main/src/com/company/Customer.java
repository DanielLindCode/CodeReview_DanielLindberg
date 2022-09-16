package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {

	// State
	private List<Account> AccountList;
	private String FullName;
	private long PNr;

	// Constructor
	public Customer(long pNr) {
		PNr = pNr;
		this.AccountList = new ArrayList<>();

	}

	public Customer(long pNr, String fullName) {
		PNr = pNr;
		FullName = fullName;
		this.AccountList = new ArrayList<>();
	}

	// Behaviour
	public boolean withdrawMoney(long pNr, int accountId, double amount) {
		var j = getAccountIndex(accountId);
		var acc = AccountList.get(j);
		var p = acc.getBalance();
		double k = p - amount;
		if (k < 0) {
			System.out.println("There's no money on your account to service your withdrawal request");
			return false;
		} else {
			System.out.println("Withdrew:" + amount + "monies");
			p = k;
			return true;
		}

	}

	// �ndrade s� att man tar in en double ist f�r en int
	// Lade ocks� till en setter i accountsklassen f�r att kunna uppdatera balance
	public boolean depositMoney(long pNr, int accountId, double amount) {

		var k = getAccountIndex(accountId);
		var acc = AccountList.get(k);
		var p = acc.getBalance();

		if (acc.getPNr() == pNr && acc.getAccountID() == accountId) {

			p += amount;

			acc.setBalance(p);

			return true;
		} else {
			System.out.println("Deposit failed!");
			return false;
		}

	}

	public int addAccount(long pNr) {

		var j = getPNr();

		int randomAccNum = ThreadLocalRandom.current().nextInt(10000, 60000);

		var k = getAccountList();

		if (j == pNr) {

			k.add(new Account(pNr, randomAccNum));

			return randomAccNum;

		} else {

			return -1;
		}
	}

	public void closeAccount(long pNr, int accountId) {

		// �r k och acc samma sak?
		var k = getAccountIndex(accountId);

		var acc = AccountList.get(k);

		var bal = acc.getBalance();

		// Jag �r inte helt 100 p� funktionen nedan s� jag gjorde om det till en
		// if-sats. F�r mig blir det tydligare.
		// �ndrade ocks� metoden till void s� man kan kalla p� funktionen s� den skriver
		// ut direkt.
		
		// AccountList.removeIf(i -> i.getAccountID() == accountId && i.getPNr() == pNr);

		if (AccountList.get(k).getAccountID() == accountId && AccountList.get(k).getPNr() == pNr) {
			AccountList.remove(k);
			System.out.println("Account with account number " + accountId + " was removed. Balance " + bal
					+ " returned to " + pNr);
		} else
			System.out.println("Unable to remove account.");

	}

	public int getAccountIndex(int accountId) {
		int accIndex = -1;
		for (var account : AccountList) {
			if (account.getAccountID() == accountId) {
				accIndex = AccountList.indexOf(account);
			}
		}
		return accIndex;
	}

	public String getAccount(long pNr, int accountId) {
		String temp = "";
		float interestRate = 0.7F;
		String kontotyp = "Debit";
		var accIndex = getAccountIndex(accountId);
		var account = AccountList.get(accIndex);
		var Id = account.getAccountID();
		var balance = account.getBalance();
		var personalnum = account.getPNr();
		if (personalnum == pNr && Id == accountId) {
			temp += "AccountID:" + String.valueOf(Id);
			temp += "Account Balance:" + String.valueOf(balance);
			temp += "Account type:" + kontotyp;
			temp += "Interest rate:" + String.valueOf(interestRate);
		}

		return temp;
	}

	public long getPNr() {
		return PNr;
	}

	public String getFullName() {
		return FullName;
	}

	public List<Account> getAccountList() {
		return AccountList;
	}
}
