package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"границы диапазона, 200, 300, 3",
            "границы диапазона, 100, 9801, 90",
            "границы диапазона, 5,9,0"})
    void shouldSQRCalculate(String test, int upperlimit, int lowerLimit, int expected) {
        SQRService result = new SQRService();
        int actual = result.sqrCalculate(upperlimit, lowerLimit);
        assertEquals(expected, actual);

        System.out.println("в диапазоне от " + upperlimit + " до " + lowerLimit + " находится " + actual + " квадрата (квадратов) натуральных чисел от 10 до 99");
    }
}
