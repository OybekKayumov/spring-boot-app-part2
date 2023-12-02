public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        //System.out.println("-".repeat(25));
        basket.add("Cheese", 250, 2);
        basket.print("Cheese");

        //System.out.println("-".repeat(25));
        basket.add("Butter", 200, 4, 0.5);
        basket.print("Butter");

        basket = new Basket();
        basket.add("Notebook", 90, 3);
        basket.add("Pencil", 23, 2);
        basket.add("Pen", 18);
        basket.print("Basket 2");

        System.out.println("Basket Count: " + Basket.getCount());
        System.out.println("Average Product Price: " + Basket.getAverageProductPrice());
        System.out.println("Average Basket Price: " + Basket.getAverageBasketPrice());

        /*
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
        */
    }
}
