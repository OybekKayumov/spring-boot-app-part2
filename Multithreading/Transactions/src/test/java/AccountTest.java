import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тест класса Account")
class AccountTest {

    private Account account;
    private static final String BALANCE_MSG = "Баланс счёта не соответствует " +
            "ожидаемому";
    private static final String NUMBER_ACC_MSG = "Номер счёта не " +
            "соответствует ожидаемому";
    private static final String BLOCK_ACC_MSG = "Флаг блокировки счёта не " +
            "соответствует ожидаемому";
    private static final double DELTA = 0.01;

    @BeforeEach
    protected void setup() {
        String accNumber = "1";
        long money = 100_000;
        account = new Account(accNumber, money);
    }

    @Test
    @DisplayName("Метод setMoney")
    void setMoney() {
        account.setMoney(50_000);
        assertEquals(50_000, account.getMoney(), DELTA, BALANCE_MSG);
    }

    @Test
    @DisplayName("Метод setAccNumber")
    void setAccNumber() {
        account.setAccNumber("10");
        assertEquals("10", account.getAccNumber(), NUMBER_ACC_MSG);
    }

    @Test
    @DisplayName("Метод setWithoutBlockAcc")
    void setWithoutBlockAcc() {
        account.setWithoutBlockAcc(false);
        assertFalse(account.isWithoutBlockAcc(), BLOCK_ACC_MSG);
    }
}