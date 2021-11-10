package ru.netology.sqr;

public class SQRService {

    /**
     * Метод рассчитывает какое кол-во чисел возведенных в квадрат попадет в заданный диапазон
     * @param minRange - нижний диапазон
     * @param maxRange - верхний диапазон
     * @return - возвращает кол-во чисел, которое попадает в заданный диапазон
     */
    public int calculateSqrt(int minRange, int maxRange) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            int result = (int) Math.pow(i, 2);
            if (result >= minRange && result <= maxRange) {
                counter++;
            }
        }
        return counter;
    }
}
