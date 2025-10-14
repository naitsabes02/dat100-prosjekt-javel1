package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {




    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();
        // Lager en kunde
        Customer kunde1 = new Customer("Ola Nordmann", "ola@norge.no", 1001, PowerAgreementType.SPOTPRICE);

        // Skriver ut kundedata
        System.out.println(kunde1);

        // Endrer navn og skriver ut igjen
        kunde1.setName("Kari Nordmann");
        System.out.println("Etter navnendring: " + kunde1.getName());
    }
}
        /*
        TODO


         Write code that creates a Customer object and teste the methods implemented in the class

        */