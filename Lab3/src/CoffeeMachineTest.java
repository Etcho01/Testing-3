import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; class CoffeeMachineTest {
    @Test
    public void test1() {
        var C = new CoffeeMachine();
        assertEquals(" Something went wrong, please check that the power is on ", C.AddMoney(10));
    }
    @Test
    public void test2() {
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ", C.StartMachine());
    }
    @Test
    public void test3() {
        var C = new CoffeeMachine();
        C.PowerOn = true;
        assertEquals(" Something went wrong, please check that the power is on ", C.StartMachine());
    }
    @Test
    public void test4() {
        var C = new CoffeeMachine();
        C.StartMachine();
        C.TurnOffMachine();
        assertEquals(" Something went wrong, please check that the power is on ", C.AddMoney(5));
    }
    @Test
    public void test5() {
        var C = new CoffeeMachine();
        C.StartMachine();
        assertEquals(" Successful transaction ", C.AddMoney(20));
    }
    @Test
    public void test6() {
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ",C.StartMachine());
        assertEquals(" Successful transaction ",C.AddMoney(20));
    }
    @Test
    public void test7(){
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ",C.StartMachine());
        assertEquals(" Successful transaction ",C.AddMoney(30));
        assertEquals(" Lights off " + "Power off ",C.TurnOffMachine());
    }
    @Test
    public void test8(){
        var C = new CoffeeMachine();
        assertEquals(" Something went wrong ,please check that the power is on ",C.MakeCoffee(2));
    }
    @Test
    public void test9(){
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ",C.StartMachine());
        assertEquals(" Successful transaction ",C.AddMoney(30));
        assertEquals(2+ " Grab your coffee ",C.MakeCoffee(2));
    }
    @Test
    public void test10(){
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ",C.StartMachine());
        assertEquals(" Successful transaction ",C.AddMoney(30));
        assertEquals(4+ " Grab your coffee ",C.MakeCoffee(4));
    }
    @Test
    public void test11(){
        var C = new CoffeeMachine();
        assertEquals(" Power on " + "Lights on ",C.StartMachine());
        assertEquals(" Successful transaction ",C.AddMoney(30));
        assertEquals(1+ " Grab your coffee ",C.MakeCoffee(1));
    }
}
