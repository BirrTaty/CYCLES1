package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        SQRService service = new SQRService();

        int underLine = 100;
        int upperLine = 200;
        int expected = 5;

        int actual = service.calculate(underLine, upperLine);

        assertEquals(expected, actual);
    }
}