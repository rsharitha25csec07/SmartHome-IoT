package io;

import java.io.*;
import java.util.List;
import rules.AutomationRule;

public class LogManager {

    public void saveEnergyLog(
            String fileName,
            String content) {

        try (FileWriter writer =
                     new FileWriter(fileName, true)) {

            writer.write(content + "\n");

            System.out.println(
                    "Energy log saved successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Error saving log: "
                    + e.getMessage());
        }
    }

    public void saveRules(
            String fileName,
            List<AutomationRule> rules) {

        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream(fileName))) {

            out.writeObject(rules);

            System.out.println(
                    "Rules saved successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Error saving rules: "
                    + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<AutomationRule> loadRules(
            String fileName) {

        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream(fileName))) {

            return (List<AutomationRule>) in.readObject();

        } catch (Exception e) {

            System.out.println(
                    "Error loading rules: "
                    + e.getMessage());
        }

        return null;
    }
}