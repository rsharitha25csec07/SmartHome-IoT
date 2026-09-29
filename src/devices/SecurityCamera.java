package devices;

public class SecurityCamera extends SmartDevice {

    public SecurityCamera(String deviceName, String ipAddress, double powerRating) {
        super(deviceName, ipAddress, powerRating);
    }

    public void startRecording() {
        System.out.println(deviceName + " recording started");
    }
}