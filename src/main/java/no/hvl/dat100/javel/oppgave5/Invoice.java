package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        // TODO - konstruktør
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;


    }

    public void computeAmount() {

        // TODO
        double total = 0.0;
        PowerAgreementType avtale = c.getAgreemet();

        for (int dag = 0; dag < usage.length; dag++) {
            for (int time = 0; time < usage[dag].length; time++) {

                double pris = prices[dag][time];
                double strombruk = usage[dag][time];

                switch (avtale) {
                    case SPOTPRICE:
                        total += strombruk * pris;
                        break;

                    case POWERSUPPORT:
                        total += strombruk * (pris * 0.9);
                        break;

                    case NORGESPRICE:
                        total += strombruk * 0.70;
                        break;

                }
            }
        }
        amount = total;
    }

    public void printInvoice() {

        // TODO

    }
}
