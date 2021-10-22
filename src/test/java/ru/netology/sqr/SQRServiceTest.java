package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        SQRService service = new SQRService();

        int underLine = 200;
        int upperLine = 300;
        int expected = 3;

        int actual = service.calculate(underLine, upperLine);

        assertEquals(expected, actual);
    }
}