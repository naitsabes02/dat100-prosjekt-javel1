package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();




        Customer kunde1 = new Customer("Ola Nordmann", "ola@norge.no", 1001, PowerAgreementType.SPOTPRICE);

        double[][] usage = MonthPowerData.powerusage_month;
        double[][] prices = MonthPowerData.powerprices_month;

        Invoice faktura = new Invoice(kunde1, "Oktober", usage, prices);

        faktura.computeAmount();
        faktura.printInvoice();

        /*a
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
