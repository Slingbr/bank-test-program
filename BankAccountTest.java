import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(123, "Test User", 100);

        account.deposit(50);
        assertEquals(150, account.getAccountBalance(), "Deposit should add money to balance.");
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(123, "Test User", 100);

        account.withdraw(40);
        assertEquals(60, account.getAccountBalance(), "Withdraw should subtract money from balance.");
    }

    @Test
    void testOverWithdraw() {
        BankAccount account = new BankAccount(123, "Test User", 100);

        account.withdraw(200);
        assertEquals(100, account.getAccountBalance(), "Withdraw should not allow balance to go negative.");
    }

    @Test
    void testAccountInfoDisplay() {
        BankAccount account = new BankAccount(123, "Test User", 100);

        assertEquals(123, account.getAccountNumber());
        assertEquals("Test User", account.getHolderName());
        assertEquals(100, account.getAccountBalance());
    }
}
