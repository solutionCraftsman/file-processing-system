import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @Test
    void number_can_beGenerated() {
        assertNotEquals(0, NumberGenerator.generate());
    }

    @Test
    void generatedNumber_isUnique() {
        int firstNumber = NumberGenerator.generate();
        int secondNumber = NumberGenerator.generate();
        int thirdNumber = NumberGenerator.generate();
        assertTrue(
                (secondNumber != firstNumber) &&
                        (thirdNumber != secondNumber)
        );
    }

    @Test
    void generatedNumber_isAutoIncremented() {
        int firstNumber = NumberGenerator.generate();
        int secondNumber = NumberGenerator.generate();
        int thirdNumber = NumberGenerator.generate();
        assertTrue(
                (secondNumber - firstNumber == 1) &&
                        (thirdNumber - secondNumber == 1)
        );
    }

}