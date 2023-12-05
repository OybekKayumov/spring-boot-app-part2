public class Container {
    private Integer count = 0;      //* default is null

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
