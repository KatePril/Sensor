package app.sensors;
import app.Substance;
import app.indicators.WeightIndicator;

public class WeightSensor extends Sensor {

    public WeightSensor() {
    }

    public WeightSensor(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Weight (g): "
                + WeightIndicator.indicateWeight(substance.getState()));
    }
}
