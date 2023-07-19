package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(2000), 0);
    }

    @org.junit.Test
    public void testRemainForCashback() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(900), 100);
    }
}
