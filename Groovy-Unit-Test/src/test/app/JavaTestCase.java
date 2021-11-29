package test.app;

import com.bank.Account;
import org.junit.Assert;
import org.junit.Test;

public class JavaTestCase {
    Account objUnderTest = new Account();

    @Test
    public void verifyAccountAvailability(){

       // if (objUnderTest==null){
            //throw new RuntimeException("Account obj not available");
        //}
        Assert.assertNotNull(objUnderTest);
    }
    @Test
    public void verifyAccountDeposit(){
        int amount = 1000;
        int initBalance  = objUnderTest.getBalance();
        objUnderTest.deposit(amount);
        int actual = objUnderTest.getBalance();
        int expected = amount + initBalance;

        Assert.assertEquals(expected,actual);
    }
}
