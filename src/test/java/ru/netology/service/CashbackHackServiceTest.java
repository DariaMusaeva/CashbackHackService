package ru.netology.service;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 2_000;

        assertEquals(service.remain(amount), 0);
    }

    @org.testng.annotations.Test
    public void testRemainForCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        assertEquals(service.remain(amount), 100);
    }
}
