public class Arithmetic {

    public int number1;
    public int number2;

    public Arithmetic() {}

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void sum(){
        System.out.println("Sum: " + (number1 + number2));
    }

    public void multiple(){
        System.out.println("Multiple: " + (number1 * number2));
    }

    public void maxOfTwo(){
        System.out.println("Max: " + Math.max(number1, number2));
    }

    public void minOfTwo(){
        System.out.println("Min: " + Math.min(number1, number2));
    }
}
