package app.sensors;

import app.Indicator;
import app.Substance;

public class ColorSensor extends Sensor {

    public ColorSensor() {
    }

    public ColorSensor(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Color: "
                + Indicator.indicateColor(substance.getState()));
    }
}
