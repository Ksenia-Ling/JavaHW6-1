package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void CalculateTotalSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.CalculateTotalSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void CalculateAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.CalculateAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void FindMaxSalesMonthNumber() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.FindMaxSalesMonthNumber(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }


    @org.junit.jupiter.api.Test
    void FindMinSalesMonthNumber() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.FindMinSalesMonthNumber(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void SumsUpMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.SumsUpMonthsWithBelowAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }

    @org.junit.jupiter.api.Test
    void SumsUpMonthsWithOverAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.SumsUpMonthsWithOverAverageSales(sales);

        assertEquals(expected, actual);

        System.out.println(actual);
    }


}