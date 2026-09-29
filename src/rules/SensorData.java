package rules;

public class SensorData<T> {

    private T value;

    public SensorData(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sensor Value: " + value;
    }
}