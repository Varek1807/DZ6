package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void test3(int expected, int max, int min) {
        SQRService service = new SQRService();
        //  int expected = 3;
        int actual = service.boundaryValues(max, min);
        Assertions.assertEquals(expected, actual);
    }

    //   @Test
    // public void test21() {
    //   SQRService service = new SQRService();
    // int expected = 21;
    //int actual = service.boundaryValues(1000, 100);
    //Assertions.assertEquals(expected, actual);
    //}

    //@Test
    //public void test12() {
    //  SQRService service = new SQRService();
    //int expected = 12;
    //int actual = service.boundaryValues(500, 100);
    //Assertions.assertEquals(expected, actual);
    // }
}
