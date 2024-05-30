package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculationOfRestServiceTest {

    @ParameterizedTest
    @CsvSource({
        "10000, 3000, 20000, 3",
        "100000, 60000, 150000, 2"
    })

    void DoubleCalculation(int income, int expenses, int threshold, int expected){
        CalculationOfRestService service = new CalculationOfRestService();

        int MonthsOfRest = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, MonthsOfRest);
    }

//    @Test
//    void TheFirstCalculation() {
//        CalculationOfRestService service = new CalculationOfRestService();
//        int income = 10000;
//        int expenses = 3000;
//        int threshold = 20000;
//        int expected = 3;
//        int MonthsOfRest = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, MonthsOfRest);
//
//    }
//
//    @Test
//    void TheSecondCalculation() {
//        CalculationOfRestService service = new CalculationOfRestService();
//        int income = 100000;
//        int expenses = 60000;
//        long expected = 2;
//        int threshold = 150000;
//        int MonthsOfRest = service.calculate(income, expenses, threshold);
//        Assertions.assertEquals(expected, MonthsOfRest);
//
//    }


}
