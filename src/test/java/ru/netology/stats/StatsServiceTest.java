package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void findTotalOfAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotalSum = 180;
        long actualTotalSum = service.totalOfAllSales(sales);

        Assertions.assertEquals(expectedTotalSum, actualTotalSum);
    }

    @Test

    public void findAverageSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSum = 15;
        long actualAverageSum = service.AverageSumInMonth(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);


    }

    @Test

    public void findMaxSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);

    }

    @Test

    public void findMinSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 8;
        long actualMinMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test

    public void findAmountOfMonthSalesBelowAverage() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCountMinMonth = 5;
        long actualCountMinMonth = service.amountOfMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expectedCountMinMonth, actualCountMinMonth);
    }
    @Test

    public void findAmountOfMonthSalesOverAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedCountMaxMonth = 5;
        long actualCountMaxMonth = service.amountOfMonthSalesOverAverage(sales);

        Assertions.assertEquals(expectedCountMaxMonth, actualCountMaxMonth);}
}





