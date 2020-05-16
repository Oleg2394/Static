package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculate() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculate(salesPerMonths);
        assertEquals(expected,actual);
    }

    @Test
    void average() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.average(salesPerMonths);
        assertEquals(expected,actual);
    }


    @Test
    void peakSales() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMaxMonthSales(salesPerMonths);
        assertEquals(expected,actual);
    }


    @Test
    void calcMinMonthSales() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMinMonthSales(salesPerMonths);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcMonthsBelowAverage(salesPerMonths);
        assertEquals(expected, actual);
    }

    @Test
    void calcMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] salesPerMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calcMonthsAboveAverage(salesPerMonths);
        assertEquals(expected, actual);
    }
}