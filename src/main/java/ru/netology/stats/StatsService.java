package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatsService {

    public int sumSales(long[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }

        return sumSales;
    }

    public double avgSales(long[] sales) {
        double sum = sumSales(sales);
        double avg = sum / sales.length;
        return avg;
    }

    public int monthHighSales(long[] sales) {
        int highMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[highMonth]) {
                highMonth = i;
            }
        }

        return highMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int countMonthMinAvg(long[] sales) {
        double avg = avgSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                month++;
            }
        }

        return month;
    }

    public int countMonthMaxAvg(long[] sales) {
        double avg = avgSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                month++;
            }
        }
        return month;
    }
}