public class Computer {

    private final String vendor;
    private final String name;

    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(String vendor, String name,
                    Processor processor, Ram ram,
                    Storage storage, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalWeight() {
        return processor.getWeight() +
               ram.getWeight() +
               storage.getWeight() +
               screen.getWeight() +
               keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Характеристики компьютера: " + "\n" +
                "Производитель: " + vendor + "\n" +
                "Название: " + name + "\n" +
                "Процессор: " + processor + "\n" +
                "Оперативная память: " + ram + "\n" +
                "Накопитель: " + storage + "\n" +
                "Экран: " + screen + "\n" +
                "Клавиатура: " + keyboard;
    }
}
