public class Storage {

    private final StorageType type;
    private final double volume;
    private final double weight;

    public Storage(StorageType type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n" +
                "Накопитель информации: " + "\n" +
                "Тип: " + type + "\n" +
                "Объем: " + volume + "\n" +
                "Вес: " + weight;
    }
}
