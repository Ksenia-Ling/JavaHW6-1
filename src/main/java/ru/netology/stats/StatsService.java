package ru.netology.stats;

public class StatsService {

    int CalculateTotalSales(int[] sales) {
        int sum = 0;
        for (int monthlySales : sales) {
            sum += monthlySales;
        }
        return sum;
    }

    double CalculateAverageSales(int[] sales) {
        int sum = 0;
        for (int monthlySales : sales) {
            sum += monthlySales;
        }
        int averageMonthlySales = sum / sales.length;

        return averageMonthlySales;
    }

    int FindMaxSalesMonthNumber(int[] sales) {
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

    int FindMinSalesMonthNumber(int[] sales) {
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

    int SumsUpMonthsWithBelowAverageSales(int[] sales) {
        int sum = 0;
        for (int monthlySales : sales) {
            sum += monthlySales;
        }
        double averageMonthlySales = sum / sales.length;
        int amountOfMonths = 0;
        for (int monthlySales : sales)
            if (monthlySales < averageMonthlySales) {
                amountOfMonths++;
            }
        return amountOfMonths;
    }

    int SumsUpMonthsWithOverAverageSales(int[] sales) {
        int sum = 0;
        for (int monthlySales : sales) {
            sum += monthlySales;
        }
       double averageMonthlySales = sum / sales.length;
        int amountOfMonths = 0;
        for (int monthlySales : sales)
            if (monthlySales > averageMonthlySales) {
                amountOfMonths++;
            }
        return amountOfMonths;
    }

}
