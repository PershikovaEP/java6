package ru.netology.java6.java6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.java6.java6.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,150,250",
            "0,0,99",
            "0,9802,20000"
    })
    public void validRange(int expected, int start, int end) {
        SQRService service = new SQRService();

//        int expected = 3;
        int actual = service.numberSqr(start, end);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void invalidRange() {
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int actual = service.numberSqr(0, 90);

//        Assertions.assertEquals(expected, actual);
//}
}
