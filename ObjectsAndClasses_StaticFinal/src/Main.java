public class Main {

    public static void main(String[] args) {

        Processor processor = new Processor(13101, 8, "Intel", 0.5);
        Ram ram = new Ram("DDR4-3200", 200, 0.3);
        Storage storage = new Storage(StorageType.SDD, 1500, 1.2);
        Screen screen = new Screen(24, ScreenType.IPS, 5.2);
        Keyboard keyboard = new Keyboard("HP", KeyboardBacklight.YES, 1.6);

        Computer computer = new Computer("HP", "Pavilion",
                processor, ram, storage, screen, keyboard);

        System.out.println(computer);

        System.out.println("-".repeat(30));
        System.out.println("Общий вес: " +
                String.format("%.2f", computer.getTotalWeight()));
    }
}
