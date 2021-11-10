package ru.netology.sqr;

public class SQRService {

    public int calculateSqrt(int minRange, int maxRange) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            int result = (int) Math.pow(i, 2);
            if (result >= minRange && result <= maxRange) {
                counter++;
                System.out.println(i);
            }
        }
        return counter;
    }
}
