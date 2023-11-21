import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
        */
        //! task 2
        Dimensions dimensions = new Dimensions(12.2, 23.3, 11.1);

        Cargo cargo = new Cargo(dimensions, 170,
                "Tashkent", false,
                "A21112023", true);

        //* dimensions all
        Dimensions copy = new Dimensions(
                dimensions.getWidth(),
                dimensions.getHeight(),
                dimensions.getLength()
        );

        System.out.println("Груз: " + cargo);
        System.out.println(String.format("Объём: " +
                "%.4f", dimensions.calcVolume()));
    }
}
