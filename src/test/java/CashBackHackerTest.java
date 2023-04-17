import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {
    CashBackHacker servis = new CashBackHacker();

    @Test
    public void calculateCashBack() {
        int actual = servis.remain(900);
        int expected = 100;
        assertEquals(expected,actual);

    }

    @Test
    public void calculateCashBack2() {
        int actual = servis.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashBack3() {
        int actual = servis.remain(3000);
        int expected =0;
        assertEquals(expected, actual);

       }

}