package app;

import app.sensors.Sensor;

import java.util.ArrayList;
import java.util.List;

public class Substance {

    private List<Sensor> sensors = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        announceState();
        notifyAllObservers();
    }

    public void attach(Sensor sensor) {
        sensors.add(sensor);
        sensor.setSubstance(this);
    }

    public void notifyAllObservers() {
        for (Sensor sensor : sensors) {
            sensor.update();
        }
    }

    private void announceState() {
        String output = "Substance temperature ";
        if (state > 0) {
            System.out.println(output + "+" + state);
        } else {
            System.out.println(output + state);
        }
    }
}
