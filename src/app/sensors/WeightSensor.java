package app.sensors;
import app.indicators.WeightIndicator;

public class WeightSensor extends Sensor {

    @Override
    public void update() {
        System.out.println("Weight (g): "
                + WeightIndicator.indicateWeight(substance.getState()));
    }
}
