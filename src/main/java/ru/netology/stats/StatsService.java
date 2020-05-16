package ru.netology.stats;

//Сумму всех продаж
public class StatsService {
    public int calculate(int[] salesPerMonth) {
        int sum = 0;
        for (int salesPerMonths : salesPerMonth) {
            sum += salesPerMonths;
        }
        return sum;
    }

    //Среднюю сумму продаж в месяц
    public int average(int[] salesPerMonth) {
        int sum = 0;
        int averageSalesMonth = 0;
        for (int salesPerMonths : salesPerMonth) {
            sum += salesPerMonths;
          averageSalesMonth =  sum / salesPerMonth.length;
        }
        return averageSalesMonth;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int calcMaxMonthSales(int[] salesPerMonths) {

        int salesMax = salesPerMonths[0];
        int monthOfMaxSales = 1;
        for (int i = 1; i < salesPerMonths.length; i++) {
            if (salesPerMonths[i] >= salesMax) {
                salesMax = salesPerMonths[i];
                monthOfMaxSales = i + 1;
            }
        }
        return monthOfMaxSales;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int calcMinMonthSales(int[] salesPerMonths) {

        int salesMin = salesPerMonths[0];
        int monthOfMinSales = 1;
        for (int i = 1; i < salesPerMonths.length; i++) {
            if (salesPerMonths[i] <= salesMin) {
                salesMin = salesPerMonths[i];
                monthOfMinSales = i + 1;
            }
        }
        return monthOfMinSales;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int calcMonthsBelowAverage(int[] salesPerMonths) {
        int average = average(salesPerMonths);
        int monthsAboveCounter = 0;
        for (int monthlySale : salesPerMonths) {
            if (monthlySale > average) {
                monthsAboveCounter++;
            }
        }
        return monthsAboveCounter;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int calcMonthsAboveAverage(int[] salesPerMonths) {
        int average = average(salesPerMonths);
        int monthsBelowCounter = 0;
        for (int monthlySale : salesPerMonths) {
            if (monthlySale < average) {
                monthsBelowCounter++;
            }
        }
        return monthsBelowCounter;
    }
}


