import javax.swing.*;

public class SmartHomeGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Smart Home Dashboard");

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
        area.append("\n" + deviceName + " - Added");
    }

});
JButton energyBtn = new JButton("Energy Report");
energyBtn.setBounds(150, 100, 150, 40);

frame.add(energyBtn);
energyBtn.addActionListener(e -> {

    area.setText(
            "ENERGY REPORT\n\n" +
            "Hour 0 : 1.5 kWh\n" +
            "Hour 1 : 2.0 kWh\n" +
            "Hour 2 : 1.8 kWh\n\n" +
            "Total Usage : 5.3 kWh");

});
JButton ruleBtn = new JButton("View Rules");
ruleBtn.setBounds(150, 200, 150, 40);

frame.add(ruleBtn);
ruleBtn.addActionListener(e -> {

    area.setText(
            "AUTOMATION RULES\n\n" +
            "IF Motion Detected\n" +
            "THEN Turn ON Light\n\n" +
            "IF Temperature > 30°C\n" +
            "THEN Turn ON Fan");

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

    area.setText(
            "Living Room Light - ON\n" +
            "Thermostat - OFF\n" +
            "Security Camera - ON");

});

        frame.add(btn);

        frame.setVisible(true);
    }
}
