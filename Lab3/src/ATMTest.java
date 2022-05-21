import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; class ATMTest {

    @Test
    public void test1(){
        var A = new ATM();
        A.ValidCard = false;
        assertEquals("Card not validated",A.EnterCard());
    }
    @Test
    public void test2(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
    }
    @Test
    public void test3(){
        var A = new ATM();
        assertEquals("Successful login",A.EnterPassword());
    }
    @Test
    public void test4(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        A.ValidPassword = false;
        assertEquals("Wrong password",A.EnterPassword());
    }
    @Test
    public void test5(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        assertEquals("Successful login",A.EnterPassword());
        assertEquals("Enter valid amount",A.MakeDeposit(10));
        assertEquals("Not enough balance",A.MakeWithdraw(10));
    }
    @Test
    public void test6(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        assertEquals("Successful login",A.EnterPassword());
        assertEquals("Successful deposit",A.MakeDeposit(2000));
        assertEquals("Successful withdraw",A.MakeWithdraw(500));
    }
    @Test
    public void test7(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        assertEquals("Successful login",A.EnterPassword());
        assertEquals("Successful deposit",A.MakeDeposit(500));
        assertEquals("Successful withdraw",A.MakeWithdraw(10));
    }
    @Test
    public void test8(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        assertEquals("Successful login",A.EnterPassword());
        assertEquals("Successful deposit",A.MakeDeposit(3000));
        assertEquals("Successful withdraw",A.MakeWithdraw(1500));
        assertEquals("Successful withdraw",A.MakeWithdraw(1500));
    }
    @Test
    public void test9(){
        var A = new ATM();
        assertEquals("Validated card",A.EnterCard());
        assertEquals("Successful login",A.EnterPassword());
        assertEquals("Successful deposit",A.MakeDeposit(500));
        assertEquals("Successful withdraw",A.MakeWithdraw(500));
        assertEquals("Not enough balance",A.MakeWithdraw(2000));
    }
}
