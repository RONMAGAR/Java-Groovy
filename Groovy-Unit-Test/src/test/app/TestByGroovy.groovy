package test.app

import com.bank.Account
import groovy.test.GroovyTestCase

class TestByGroovy  extends GroovyTestCase
{
    public void testAccountObject()
    {
        def obj = new Account()
        assertNotNull(obj)
    }

    public void testAccountDeposit()
    {
        def obj = new Account()
        def initBalance = obj.balance
        int amount = 1000
        obj.deposit(amount)
        def currentBalance = obj.balance
        def expectedBalance = 1100
        assert expectedBalance==currentBalance
    }
}
