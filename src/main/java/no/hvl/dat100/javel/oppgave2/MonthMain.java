package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Strøm for en måned: ");
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println("Prisen for strøm hver dag i en måned: ");
        MonthlyPower.print_PowerPrices(power_prices_month);



        double totalUsage = MonthlyPower.computePowerUsage(MonthPowerData.powerusage_month);
        System.out.println("Strømforbruk denne måneden er: " + totalUsage + " kWh");

        double threshold = 909.0;
        boolean exceededUsage = MonthlyPower.exceedThreshold(MonthPowerData.powerusage_month, threshold);
        System.out.println("Om threshold er overgått: " + exceededUsage);


        double pris = MonthlyPower.computeSpotPrice(MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        System.out.println("Strømpris denne måneden: " + pris + " NOK");

        double stotte = MonthlyPower.computePowerSupport(MonthPowerData.powerusage_month,MonthPowerData.powerprices_month);
        System.out.println("Strømstøtte denne måneden: " + stotte + " NOK");


        double price = MonthlyPower.computeNorgesPrice(MonthPowerData.powerprices_month);
        System.out.println("Norgespris " + price);


         /* Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}