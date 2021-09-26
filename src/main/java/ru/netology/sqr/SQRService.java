package ru.netology.sqr;

public class SQRService {
    public int sqrCalculate(int upperLimit, int lowerLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= upperLimit)
                if (i * i <= lowerLimit) {
                    counter = counter + 1;

                }
        return counter;
    }

}


