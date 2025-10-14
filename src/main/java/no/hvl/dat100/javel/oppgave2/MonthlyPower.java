package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        // TODO
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                System.out.print(usage[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println();

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(prices[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        // TODO
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        // TODO
        int dag = 0;
        while (dag < powerusage.length && !exceeded) {
            for (int t = 0; t < powerusage[dag].length; t++) {
                usage = usage + powerusage[dag][t];
                if (usage > threshold) {
                    exceeded = true;
                    break;
                }
            }
            dag++;
        }
        return exceeded;
    }
    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price += usage[i][j] * prices[i][j];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double maxPris = 0.70;
        double support = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                if (prices[i][j] > maxPris) {
                    double diff = prices[i][j] - maxPris;
                    support += usage[i][j] * diff;
                }
            }
        }
        return support;
    }



    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double NP = 0.70;


        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price = price + usage[i][j];
            }
        }


        price = price * NP;

        return price;
    }
}