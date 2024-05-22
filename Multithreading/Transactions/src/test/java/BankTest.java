import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest extends TestCase {

    private Bank bank = new Bank();
    long sum;

    @Override
    protected void setUp() {
        bank.addAccounts("80932", 275_000);
        bank.addAccounts("80931", 0);
        bank.addAccounts("80930", 250_000);
        bank.addAccounts("80929", 0);

        System.out.println(bank.getSumAllAccounts());
        System.out.println(bank.getBalance("80932"));
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            threads.add(new Thread(() -> {
                try {
                    bank.transfer("80932", "80931", 55_000);
                    bank.transfer("80930", "80929", 55_000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }));
        }
        threads.forEach(Thread::start);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(bank.getSumAllAccounts());
        System.out.println("80932: " + bank.getBalance("80932"));
        System.out.println("80930: " + bank.getBalance("80930"));

        sum = bank.getSumAllAccounts();
    }

    public void testGetSumAllAccounts() {
        long expected = 525_000;
        long actual = sum;
        assertEquals(expected, actual);
    }
}