public class Basket {

    private static int count = 0;
    private static int totalProductCount = 0;
    private static int totalProductPrice = 0;

    private static int basketCount = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount(1);
        basketCount = basketCount + 1;
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0.0);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0);

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
    }

    public void add(String name, int price, int count, double weight) {

        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + weight * count + " кг - " +
            price * count + " руб.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public double getTotalWeight(double totalWeight) {
        return totalWeight;
    }

    public static void increaseTotalValues(int price, int count) {
        totalProductCount = totalProductCount + count;
        totalProductPrice = totalProductPrice + count * price;
    }


    public static int getAverageProductPrice() {
        return totalProductPrice / totalProductCount;
    }

    public static int getAverageBasketPrice() {
        return totalProductPrice / basketCount;
    }

    public static int getBasketCount() {
        return basketCount;
    }
}
