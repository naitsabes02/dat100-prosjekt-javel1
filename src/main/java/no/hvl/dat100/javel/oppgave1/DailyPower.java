package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        // TODO
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("%.2f kWh ", prices[i]);
        }
        System.out.println();


    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        // TODO
        for (int i = 0; i < usage.length; i++) {
            System.out.printf("%.2f NOK ", usage[i]);
        }
        System.out.println();
    }


    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        // TODO
        for (int stab = 0; stab < usage.length; stab++) {
            sum = sum + usage[stab];
        }


        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;


        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < usage.length; j++) {
                price = prices[i] * usage[j];

            }
            System.out.printf("%.2f Straumforbruk pr time: ", price);
        }

        return price;
    }
    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;


        // TODO
        if (price >= THRESHOLD) {
            support = PERCENTAGE * (price - THRESHOLD) * usage;
        } else {
            support = 0;
        }

        return support;
    }


    // f) compute power support for a single day

    public static double computePowerSupport(double[] usage, double[] prices) {
        double totalSupport = 0;
        for (int i = 0; i < usage.length; i++) {
            double support = getSupport(usage[i], prices[i]);
            totalSupport += support;
        }
        System.out.println("Total støtte: " + totalSupport);
        return totalSupport;
    }


    private static final double NORGESPRIS_KWH = 0.5;

    // h) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;
        double NP = 0.50;

        double sum = 0;
        for (int stab = 0; stab < usage.length; stab++) {
            sum = sum + usage[stab];
        }

        price = sum * NP;
        return price;
    }


    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double totalusage = 0;
        double temp_max = 0;

        for (int i = 0; i < usage.length; i++) {
            totalusage += usage[i];
        }
        temp_max = totalusage * 0.5;


        return temp_max;

    }

    // i)
    public static double findAvgPower(double[] usage) {

        double average = 0;

        double sum = 0;
        for(int stab = 0; stab < usage.length; stab++) {
            sum = sum + usage[stab];
        }
        average = sum / usage.length;

        return average;
    }
}