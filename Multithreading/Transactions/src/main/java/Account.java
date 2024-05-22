public class Account implements Comparable<Account>{

    private long money;
    private String accNumber;
    private boolean withoutBlockAcc;

    public Account(String accNumber, long money) {
        this.money = money;
        this.accNumber = accNumber;
        this.withoutBlockAcc = true;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isWithoutBlockAcc() {
        return withoutBlockAcc;
    }

    public void setWithoutBlockAcc(boolean withoutBlockAcc) {
        this.withoutBlockAcc = withoutBlockAcc;
    }

    @Override
    public int compareTo(Account o) {
        return o.getAccNumber().compareTo(o.getAccNumber());
    }
}
