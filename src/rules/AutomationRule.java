package rules;

import java.io.Serializable;

public class AutomationRule implements Serializable {

    private String trigger;
    private String action;

    public AutomationRule(String trigger, String action) {
        this.trigger = trigger;
        this.action = action;
    }

    public String getTrigger() {
        return trigger;
    }

    public String getAction() {
        return action;
    }

    public void executeRule() {
        System.out.println("Trigger: " + trigger);
        System.out.println("Action: " + action);
    }

    @Override
    public String toString() {
        return "IF " + trigger + " THEN " + action;
    }
}