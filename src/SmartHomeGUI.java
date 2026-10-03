import javax.swing.*;
import devices.*;
import rules.*;

public class SmartHomeGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Smart Home Dashboard");
       HomeHub hub = new HomeHub("My Smart Home");
       AutomationRule rule1 = new AutomationRule(
        "Motion Detected",
        "Turn ON Light");

AutomationRule rule2 = new AutomationRule(
        "Temperature > 30°C",
        "Turn ON Fan");

SmartLight light = new SmartLight(
        "Living Room Light", "192.168.1.10", 20);

Thermostat thermostat = new Thermostat(
        "Home Thermostat", "192.168.1.11", 5);

SecurityCamera camera = new SecurityCamera(
        "Security Camera", "192.168.1.12", 15);

hub.addDevice(light);
hub.addDevice(thermostat);
hub.addDevice(camera);

        frame.setSize(550, 550);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("View Devices");
        btn.setBounds(150, 150, 150, 40);
        
        JTextArea area = new JTextArea();
        JButton addBtn = new JButton("Add Device");
addBtn.setBounds(150, 50, 150, 40);

frame.add(addBtn);
addBtn.addActionListener(e -> {

    String deviceName = JOptionPane.showInputDialog(
            frame,
            "Enter Device Name:");

    if(deviceName != null && !deviceName.isEmpty()) {

        SmartLight newLight = new SmartLight(
                deviceName,
                "192.168.1.20",
                20);

        hub.addDevice(newLight);

        area.append("\n" + deviceName + " - Added");

    }

});
JButton energyBtn = new JButton("Energy Report");
energyBtn.setBounds(150, 100, 150, 40);

frame.add(energyBtn);
energyBtn.addActionListener(e -> {

    double totalPower = hub.getTotalPower();

    area.setText(
            "ENERGY REPORT\n\n" +
            "Total Connected Power : " +
            totalPower + " W");

});
JButton ruleBtn = new JButton("View Rules");
ruleBtn.setBounds(150, 200, 150, 40);

frame.add(ruleBtn);
ruleBtn.addActionListener(e -> {

    area.setText(
            "AUTOMATION RULES\n\n" +
            rule1 + "\n\n" +
            rule2);

});
JButton exitBtn = new JButton("Exit");
exitBtn.setBounds(150, 250, 150, 40);

frame.add(exitBtn);
exitBtn.addActionListener(e -> {

    System.exit(0);

});

area.setBounds(50, 330, 380, 120);

frame.add(area);
btn.addActionListener(e -> {

    area.setText("");

    hub.displayDevices();

    area.setText(
            "DEVICES IN " + hub.getHubName() + "\n\n" +
            light + "\n" +
            thermostat + "\n" +
            camera
    );

});
        frame.add(btn);

        frame.setVisible(true);
    }
}
