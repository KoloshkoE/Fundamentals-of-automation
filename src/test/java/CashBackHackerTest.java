import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {

    @Test
    void calculateCashBack (){
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(900);
        int expected = 100;
        assertEquals(expected,actual);

    }

    @Test
    void calculateCashBack2 (){
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(1500);
        int expected = 500;
        assertEquals(expected,actual);

    }

    @Test
    void calculateCashBack3 (){
        CashBackHacker servis = new CashBackHacker();
        int actual = servis.remain(2000);
        int expected = 0;
        assertEquals(expected,actual);

    }

}