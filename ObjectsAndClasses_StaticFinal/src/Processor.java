public class Processor {

    private final double frequency;
    private final int numberOfCores;
    private final String vendor;
    private final double weight;

    public Processor(double frequency, int numberOfCores,
                     String vendor, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.vendor = vendor;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n" +
                "Процессор: " + "\n" +
                "Частота: " + frequency + "\n" +
                "Количество ядер: " + numberOfCores + "\n" +
                "Производитель: " + vendor + "\n" +
                "Весь: " + weight;
    }
}
