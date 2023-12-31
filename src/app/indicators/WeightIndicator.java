package app.indicators;

public class WeightIndicator implements Indicator{
    public static String indicateWeight(int temperature) {
        if (temperature <= 0) {
            return "1";
        } else {
            int weight = temperature * 2 + 1;
            return Integer.toString(weight);
        }
    }
}
