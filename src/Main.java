import devices.*;

public class Main {

    public static void main(String[] args) {

        SmartLight light = new SmartLight(
                "Living Room Light", "192.168.1.10", 12
        );

        Thermostat thermostat = new Thermostat(
                "Home Thermostat", "192.168.1.11", 50
        );

        SecurityCamera camera = new SecurityCamera(
                "Security Camera", "192.168.1.12", 20
        );

        light.turnOn();
        light.adjustBrightness(80);

        thermostat.turnOn();
        thermostat.setTemperature(24.5);

        camera.turnOn();
        camera.startRecording();

        System.out.println();
        System.out.println(light);
        System.out.println(thermostat);
        System.out.println(camera);

        light.turnOff();
        thermostat.turnOff();
        camera.turnOff();
    }
}
