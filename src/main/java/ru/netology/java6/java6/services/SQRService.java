package ru.netology.java6.java6.services;

public class SQRService {

    public int numberSqr(int start, int end) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= start && i * i <= end) {
                x = x + 1;
            }
        }
        return x;
    }
}
