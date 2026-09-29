package devices;

public class SmartDevice implements Controllable {
    protected String deviceName;
    protected String ipAddress;
    protected boolean status;
    protected double powerRating;

    public SmartDevice(String deviceName, String ipAddress, double powerRating) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.powerRating = powerRating;
        this.status = false;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is OFF");
    }

    @Override
    public String getStatus() {
        return status ? "ON" : "OFF";
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public double getPowerRating() {
        return powerRating;
    }

    @Override
    public String toString() {
        return "Device: " + deviceName +
                ", IP: " + ipAddress +
                ", Status: " + getStatus() +
                ", Power: " + powerRating + "W";
    }
}