package devices;

public class Thermostat extends SmartDevice {

    public Thermostat(String deviceName, String ipAddress, double powerRating) {
        super(deviceName, ipAddress, powerRating);
    }

    public void setTemperature(double temperature) {
        System.out.println(deviceName +
                " temperature set to " + temperature + "°C");
    }
}