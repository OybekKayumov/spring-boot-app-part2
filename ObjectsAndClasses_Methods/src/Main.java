public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        System.out.println("-".repeat(25));
        basket.add("Cheese", 250, 2);
        basket.print("Cheese");

        System.out.println("-".repeat(25));
        basket.add("Butter", 200, 4, 0.5);
        basket.print("Butter");

        System.out.println();
        System.out.println("--Task-1--Arithmetics--");
        Arithmetic arithmetic = new Arithmetic(3, 8);
        arithmetic.sum();
        arithmetic.multiple();
        arithmetic.maxOfTwo();
        arithmetic.minOfTwo();

        //* test
        System.out.println("-".repeat(25));
        Arithmetic calculations = new Arithmetic(10, 15);
        arithmetic.sum();
        calculations.sum();
        arithmetic.sum();

    }
}
