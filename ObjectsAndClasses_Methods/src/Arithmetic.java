public class Arithmetic {

    private int number1 = 4;
    private int number2 = 5;

    public void Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int multiple(int a, int b){
        return a * b;
    }

    public int maxOfTwo(int a, int b){
        return Math.max(a, b);
    }

    public int minOfTwo(int a, int b){
        return Math.min(a, b);
    }
}
