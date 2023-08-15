package app.sensors;
import app.indicators.ColorIndicator;

public class ColorSensor extends Sensor {

    @Override
    public void update() {
        System.out.println("Color: "
                + ColorIndicator.indicateColor(substance.getState()));
    }
}
