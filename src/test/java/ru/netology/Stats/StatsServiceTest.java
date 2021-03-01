package ru.netology.Stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {3, 5, 8, 4, 5, 12, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}