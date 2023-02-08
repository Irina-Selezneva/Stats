package ru.netology.stats;

public class StatsService {

    public int totalOfAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int AverageSumInMonth(long[] sales) {
        int sum = totalOfAllSales(sales);
        return (int) sum / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountOfMonthSalesBelowAverage(long[] sales) {

        int countMonth = 0;
        int averageSum = AverageSumInMonth(sales);

        for (long sale : sales) {

            if (sale < averageSum)
                countMonth++;
            }
            return countMonth;

        }
    public int amountOfMonthSalesOverAverage(long[] sales) {

        int countMonth = 0;
        int averageSum = AverageSumInMonth(sales);

        for (long sale : sales) {

            if (sale > averageSum)
                countMonth++;
        }
        return countMonth;
        }
    }




