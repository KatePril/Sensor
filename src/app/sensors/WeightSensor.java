package app.sensors;

import app.Indicator;
import app.Substance;

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
                + Indicator.indicateWeight(substance.getState()));
    }
}
