package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MockData {
    public static Collection<Customer> Customers = new ArrayList<>();

    public static void LoadCustomersAndAccounts(){

        var c1 = new Customer(19880622L, "Pelle Plutt");
        var c2 = new Customer(19851212L, "Anna Panna");
        var c3 = new Customer(20000101L, "Peepo Poopo");
        c1.addAccount(c1.getPNr());
        c2.addAccount(c2.getPNr());
        c3.addAccount(c3.getPNr());

        //List<Customer> customers = new ArrayList<>();
        Customers.add(c1);
        Customers.add(c2);
        Customers.add(c3);
}
}
