import java.util.ArrayList;
import java.util.List;
import devices.SmartDevice;

public class HomeHub {

    private String hubName;
    private List<SmartDevice> devices;

    public HomeHub(String hubName) {
        this.hubName = hubName;
        devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void displayDevices() {
        System.out.println("Devices in " + hubName + ":");

        for (SmartDevice device : devices) {
            System.out.println(device);
        }
    }
    public List<SmartDevice> getDevices() {
    return devices;
}
public double getTotalPower() {
    double total = 0;

    for (SmartDevice device : devices) {
        total += device.getPowerRating();
    }

    return total;
}

    public String getHubName() {
        return hubName;
    }
    
}