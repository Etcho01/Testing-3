import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DigitalWatchTest {
    @Test
    void test1() {
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
    }
    @Test
    public void test2(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("watch is turned on",D.TurnOn());
    }
    @Test
    public void test3(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("watch is turned on",D.TurnOn());
        assertEquals("Turned off",D.TurnOff());
    }
    @Test
    public void test4(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("Timer set",D.SetTimer(10));
    }
    @Test
    public void test5(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("Timer set",D.SetTimer(10));
        assertEquals("Wait for timer to end",D.Interrupt());
    }
    @Test
    public void test6(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("Timer set",D.SetTimer(10));
        D.TimerTick = false;
        assertEquals("Accepted",D.Interrupt());
    }
    @Test
    public void test7(){
        var D = new DigitalWatch();
        assertEquals("Turned On",D.TurnOn());
        assertEquals("Timer set",D.SetTimer(10));
        D.TimerTick = false;
        assertEquals("Accepted",D.Interrupt());
        assertEquals("Turned off",D.TurnOff());
    }

}
