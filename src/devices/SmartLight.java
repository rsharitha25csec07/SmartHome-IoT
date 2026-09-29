package devices;

public class SmartLight extends SmartDevice {

    public SmartLight(String deviceName, String ipAddress, double powerRating) {
        super(deviceName, ipAddress, powerRating);
    }

    public void adjustBrightness(int level) {
        System.out.println(deviceName +
                " brightness set to " + level + "%");
    }
}