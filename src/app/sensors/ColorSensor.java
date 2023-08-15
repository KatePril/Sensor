package app.sensors;

import app.indicators.ColorIndicator;
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
                + ColorIndicator.indicateColor(substance.getState()));
    }
}
