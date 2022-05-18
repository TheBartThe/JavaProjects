package tddmicroexercises.tirepressuremonitoringsystem;

public class StubSensor implements ISensor{

    private double pressure;

    public StubSensor(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.pressure;
    }
}
