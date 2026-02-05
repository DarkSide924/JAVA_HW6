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
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        double avg = (double) sum / sales.length;
        return avg;
    }

    public int monthHighSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] / sales.length <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int countMonthMinAvg(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        double avg = (double) sum / sales.length;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                month++;
            }
        }

        return month;
    }

    public int countMonthMaxAvg(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        double avg = (double) sum / sales.length;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                month++;
            }
        }

        return month;
    }
}