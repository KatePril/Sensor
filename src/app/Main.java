package app;

import app.sensors.ColorSensor;
import app.sensors.WeightSensor;

public class Main {

    public static void main(String[] args) {

        Substance substance = new Substance();
        substance.attach(new ColorSensor());
        substance.attach(new WeightSensor());

        int[] temperatures = {25, -5, 0, 10, -8};
        for (int temperature : temperatures) {
            substance.setState(temperature);
            System.out.println();
        }

    }
}
