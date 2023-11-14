public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        System.out.println("---Arithmetics---");
        Arithmetic arithmetic = new Arithmetic(3, 8);
        arithmetic.sum();
        arithmetic.multiple();
        arithmetic.maxOfTwo();
        arithmetic.minOfTwo();

    }
}
