package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;


        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        /*
        TODO
         */
        // Del A
        System.out.println("Strømpriser for døgnet: ");
        DailyPower.printPowerPrices(DayPowerData.powerprices_day);

        // Del B
        System.out.println("Straumforbruk: ");
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);

        // Del C
        double sum = DailyPower.computePowerUsage(powerusage_day);

        System.out.println("Strøm for en dag: " + sum);

        // Del D
        System.out.println("Strømforbruk: ");
        DailyPower.computeSpotPrice(DayPowerData.powerprices_day,powerusage_day);


        // Del F
        double støtte = DailyPower.computePowerSupport(DayPowerData.powerusage_day,DayPowerData.powerprices_day);
        System.out.printf("Total strømstøtte for dagen: %.2f NOK%n", støtte);

        // Del G
        double norgespris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("Total Norgespris for dagen: %.2f NOK%n", norgespris);

        // Del H

        double maksBruk = DailyPower.findPeakUsage(DayPowerData.powerusage_day);
        System.out.printf("Når brukes strømmens mest på dagen: %.2f NOK%n", maksBruk);
        // Del I
        double averagePower = DailyPower.findAvgPower(DayPowerData.powerusage_day);
        System.out.printf("Gjennomsnittlig strømbruk for dagen: %.2f NOK%n", averagePower);


    }
}