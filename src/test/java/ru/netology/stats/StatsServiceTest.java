package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAvg = 15;
        double actualAvg = service.avgSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void findNumMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.monthHighSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findNumMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.monthMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findCountMonthSalesMinAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.countMonthMinAvg(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void findCountMonthSalesMaxAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;
        int actualCount = service.countMonthMaxAvg(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}
