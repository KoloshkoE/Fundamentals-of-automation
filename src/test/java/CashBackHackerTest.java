import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashBackHackerTest {


    @Test
    public void calculateCashBack() {
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(900);
        int expected = 100;
        assertEquals(actual,expected);

    }

    @Test
    public void calculateCashBack2() {
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(1500);
        int expected = 500;
        assertEquals(actual,expected);

    }

    @Test
    public void calculateCashBack3() {
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(2000);
        int expected =0;
        assertEquals(actual,expected);

    }

}