package ru.netology.stats;

public class StatsService {

    int calculateTotalSales(int[] sales) {
        int sum = 0;
        for (int monthlySales : sales) {
            sum += monthlySales;
        }
        return sum;
    }

    double calculateAverageSales(int[] sales) {
        int sum = calculateTotalSales(sales);
        int averageMonthlySales = sum / sales.length;

        return averageMonthlySales;
    }

    int findMaxSalesMonthNumber(int[] sales) {
        int currentMaxSales = sales[0];
        int indexOfCurrentMax = 0;
        for (int counter = 0; counter < sales.length; counter++) {
            int monthlySales = sales[counter];
            if (currentMaxSales <= monthlySales) {
                currentMaxSales = monthlySales;
                indexOfCurrentMax = counter;
            }
        }
        return indexOfCurrentMax + 1;
    }

    int findMinSalesMonthNumber(int[] sales) {
        int currentMinSales = sales[0];
        int indexOfCurrentMin = 0;
        for (int counter = 0; counter < sales.length; counter++) {
            int monthlySales = sales[counter];
            if (currentMinSales >= monthlySales) {
                currentMinSales = monthlySales;
                indexOfCurrentMin = counter;
            }
        }
        return indexOfCurrentMin + 1;
    }

    int sumsUpMonthsWithBelowAverageSales(int[] sales) {
        double averageMonthlySales = calculateAverageSales(sales);
        int amountOfMonths = 0;
        for (int monthlySales : sales)
            if (monthlySales < averageMonthlySales) {
                amountOfMonths++;
            }
        return amountOfMonths;
    }

    int sumsUpMonthsWithOverAverageSales(int[] sales) {
       double averageMonthlySales = calculateAverageSales(sales);
        int amountOfMonths = 0;
        for (int monthlySales : sales)
            if (monthlySales > averageMonthlySales) {
                amountOfMonths++;
            }
        return amountOfMonths;
    }

}
