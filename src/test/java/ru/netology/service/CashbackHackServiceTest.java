package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(2_000), 0);
    }

    @org.junit.Test
    public void testRemainForCashback() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(900), 100);
    }

    @org.junit.jupiter.api.Test
    public void testRemainJunit5() {
        CashbackHackService service = new CashbackHackService();

        org.junit.jupiter.api.Assertions.assertEquals(service.remain(2_000), 0);
    }

    @org.junit.jupiter.api.Test
    public void testRemainForCashbackJunit5() {
        CashbackHackService service = new CashbackHackService();

        org.junit.jupiter.api.Assertions.assertEquals(service.remain(900), 100);
    }
}
