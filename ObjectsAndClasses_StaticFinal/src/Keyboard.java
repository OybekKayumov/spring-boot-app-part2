public class Keyboard {

    private final String type;
    private final KeyboardBacklight backlight;
    private final double weight;

    public Keyboard(String type, KeyboardBacklight backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n" +
                "Keyboard: " +
                "Тип: " + type + "\n" +
                "Подсветка: " + backlight + "\n" +
                "вес: " + weight;
    }
}
