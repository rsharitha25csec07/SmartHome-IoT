package monitor;

import exceptions.ThresholdExceededException;

public class EnergyMonitor {

    private double[] hourlyUsage = new double[24];

    public void addUsage(int hour, double usage) {

        if (hour >= 0 && hour < 24) {
            hourlyUsage[hour] = usage;
            System.out.println("Energy usage added.");
        } else {
            System.out.println("Invalid hour.");
        }
    }

    public double getTotalUsage() {

        double total = 0;

        for (double usage : hourlyUsage) {
            total += usage;
        }

        return total;
    }

    public void checkThreshold(double limit)
            throws ThresholdExceededException {

        if (getTotalUsage() > limit) {
            throw new ThresholdExceededException(
                    "Energy threshold exceeded!"
            );
        }
    }

    public void displayUsage() {

        System.out.println("\nHourly Energy Usage");

        for (int i = 0; i < hourlyUsage.length; i++) {
            System.out.println(
                    "Hour " + i + " : "
                    + hourlyUsage[i] + " kWh"
            );
        }

        System.out.println(
                "Total Usage: "
                + getTotalUsage()
                + " kWh"
        );
    }
}