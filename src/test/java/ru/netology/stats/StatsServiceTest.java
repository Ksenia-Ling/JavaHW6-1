package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateTotalSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateTotalSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.calculateAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void findMaxSalesMonthNumber() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxSalesMonthNumber(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }


    @org.junit.jupiter.api.Test
    void findMinSalesMonthNumber() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesMonthNumber(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void sumsUpMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.sumsUpMonthsWithBelowAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void sumsUpMonthsWithOverAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.sumsUpMonthsWithOverAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }


}