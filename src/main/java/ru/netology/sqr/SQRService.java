package ru.netology.sqr;

public class SQRService {

    public int calculate(int underLine, int upperLine) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int square = i * i;

            if (square >= underLine && square <= upperLine) {
                counter++;
            }
        }

        return counter;
    }


}
