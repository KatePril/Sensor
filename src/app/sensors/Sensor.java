package app.sensors;

import app.Substance;

public abstract class Sensor {

    protected Substance substance;

    public void update() {
        System.out.println("No change detected");
    };

    public Substance getSubstance() {
        return substance;
    }

    public void setSubstance(Substance substance) {
        this.substance = substance;
    }
}
