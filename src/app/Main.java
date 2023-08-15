package app;

import app.sensors.ColorSensor;
import app.sensors.WeightSensor;

public class Main {

    public static void main(String[] args) {

        Substance substance = new Substance();
        substance.attach(new ColorSensor());
        substance.attach(new WeightSensor());

        monitorSubstance(substance, new int[]{25, -5, 0, 10, -8, 1, -6});

    }

    private static void monitorSubstance(Substance substance, int[] temperatures) {
        for (int temperature : temperatures) {
            substance.setState(temperature);
            System.out.println();
        }
    }
}
