package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }

        return sumSales;
    }

    public long avgSales(long[] sales) {

        long avg = sumSales(sales) / sales.length;
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
        long avg = avgSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                month++;
            }
        }

        return month;
    }

    public int countMonthMaxAvg(long[] sales) {
        long avg = avgSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                month++;
            }
        }
        return month;
    }
}