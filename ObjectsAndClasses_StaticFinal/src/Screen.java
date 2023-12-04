public class Screen {

    private final int diagonal;
    private final ScreenType type;
    private final double weight;

    public Screen(int diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n" +
                "Экран: " + "\n" +
                "Диагональ: " + diagonal + "\n" +
                "Тип: " + type + "\n" +
                "Вес: " + weight;
    }
}
