package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"ValidValue | 200 | 300 | 3",
                        "minRange | 100 | 100 | 1",
                        "maxRange | 9801 | 9801| 0",
                        "maxBorderRange | 100 | 9801 | 89",
                        "BelowTheRange | 0 | 99 | 0",
                        "OverTheRange | 9802 | 15000 | 0"}, delimiter = '|')
    void shouldCalculateSqrt(String testName, int minRange, int maxRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateSqrt(minRange, maxRange);

        assertEquals(expected, actual);
    }
}