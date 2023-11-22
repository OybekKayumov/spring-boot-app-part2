public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean canTurn;
    private final String regNum;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight,
                 String address, boolean canTurn,
                 String regNum, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.canTurn = canTurn;
        this.regNum = regNum;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isCanTurn() {
        return canTurn;
    }

    public String getRegNum() {
        return regNum;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    public Cargo setCanTurn(boolean canTurn) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    public Cargo setRegNum(String  regNum) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    public Cargo setIsFragile(boolean isFragile) {
        return new Cargo(dimensions,weight, address,
                canTurn, regNum, isFragile);
    }

    @Override
    public String toString() {
        return "Cargo: " +
                "dimensions: " + dimensions + "\n" +
                "weight= " + weight + "\n" +
                "address= " + address + "\n" +
                "canTurn= " + canTurn + "\n" +
                "regNum= " + regNum + "\n" +
                "isFragile= " + isFragile;
    }
}
