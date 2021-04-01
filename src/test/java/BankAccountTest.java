import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankAccountTest {
    @Test
    void deposit() {
    BankAccount account= new BankAccount("Ordaal","Mthethwa",1000,BankAccount.CHECKING);
    double balance =account.deposit(200,true);
    assertEquals(1200.00,balance,0);
    assertEquals(1200.00,account.getBalance(),0);
    }

    @Test
    void withdraw() throws Exception {
        BankAccount account =new BankAccount ("Ordaal","Mthethwa",1000,BankAccount.CHECKING);
        account.withdraw(1200,true);
        assertEquals(1200,account.getBalance(),0);
    }

    @Test
    void getBalance() throws  Exception {
        BankAccount account =new BankAccount("Ordaal", "Mthethwa",1000,BankAccount.CHECKING);
        account.deposit(200,true);
        assertEquals(800, account.getBalance(),0);
    }
              @Test

   public void isChecking_true(){

       BankAccount account =new BankAccount("Ordaal", "Mthethwa",1000,BankAccount.CHECKING);
        assertTrue(account.isChecking());
    }
//time out test
    void setUp() {
        // fails if execution time exceeds 5 seconds
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() {
        // fails if execution time exceeds 100 milliseconds
    }

///disbale test
    @Disabled("Disabled until bug #99 has been fixed")
    class DisabledClassDemo {

}


    @Test
    void failingTest() {
        fail("a failing test");
    }

    private void fail(String a_failing_test) {
    }
}
    



