package ru.netology.stats;


public class StatsService {

    //сумма всех продаж
    public int calculateSumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }


    //Средняя сумма продаж в месяц
    public int calculateAverageSum(int[] sales) {

        return calculateSumSales(sales) / sales.length;
    }


    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int calculateMaxSales(int[] sales) {
        int maxMouth = 0;
        int mouth = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMouth]) {
                maxMouth = mouth;
            }
            mouth = mouth + 1;
        }
        return maxMouth + 1;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int calculateMinSales(int[] sales) {
        int minMouth = 0;
        int mouth = 0;
        for (int sale : sales) {
            if (sale <= sales[minMouth]) {
                minMouth = mouth + 1;
            }
            mouth = mouth + 1;
        }
        return minMouth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего
    public int calculateMediumQuantityMonthMin(int[] sales) {
        int month = 0;
        int averageSum = calculateAverageSum(sales);

        for (int sale : sales) {
            if (sale > averageSum) {
                month += 1;
            }
        }
        return month;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int calculateMediumQuantityMonthMax(int[] sales) {
        int month = 0;
        int averageSum = calculateAverageSum(sales);

        for (int sale : sales) {
            if (sale < averageSum) {
                month += 1;
            }
        }
        return month;

    }

}
