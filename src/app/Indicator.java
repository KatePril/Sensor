package app;

public class Indicator {

    public static String indicateColor(int temperature) {
        if (temperature <= 0) return "white";
        else return "black";
    }

    public static String indicateWeight(int temperature) {
        if (temperature <= 0) {
            return "1";
        } else {
            int weight = temperature * 2 + 1;
            return Integer.toString(weight);
        }
    }
}
