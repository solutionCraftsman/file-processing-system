import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void id_can_beGenerated() {
        assertNotEquals(0, IdGenerator.generate());
    }

    @Test
    void generatedId_isUnique() {
        int firstId = IdGenerator.generate();
        int secondId = IdGenerator.generate();
        int thirdId = IdGenerator.generate();
        assertTrue(
                (secondId != firstId) &&
                        (thirdId != secondId)
                );
    }

    @Test
    void generatedId_isAutoIncremented() {
        int firstId = IdGenerator.generate();
        int secondId = IdGenerator.generate();
        int thirdId = IdGenerator.generate();
        assertTrue(
                (secondId - firstId == 1) &&
                        (thirdId - secondId == 1)
                );
    }

}