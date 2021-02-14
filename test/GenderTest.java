import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void gender_canReturn_stringRepresentation() {
        assertEquals("Male", Gender.MALE.toString());
        assertEquals("Female", Gender.FEMALE.toString());
    }
}