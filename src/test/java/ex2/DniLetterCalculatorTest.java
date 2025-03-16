package ex2;

import org.ex2.classes.DniLetterCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class DniLetterCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "55555555, K", "23456789, D", "34567890, V", "45678901, G", "56789012, B",
            "67890123, B", "78901234, X", "89012345, E", "90123456, A", "12398765, V"
    })
    void testCalculateLetter(long dniNumber, char expectedLetter) {
        DniLetterCalculator calculator = new DniLetterCalculator();

        assertEquals(expectedLetter, calculator.calculateLetter(dniNumber));
    }
}
