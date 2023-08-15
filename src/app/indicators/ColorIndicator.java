package app.indicators;

public class ColorIndicator implements Indicator{
    public static String indicateColor(int temperature) {
        if (temperature <= 0) return "white";
        else return "black";
    }
}
