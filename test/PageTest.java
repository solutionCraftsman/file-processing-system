import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PageTest {

    Page page;

    @BeforeEach
    void setUp() {
        page = new Page("Day 1", "Just dey lavish");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pageHas_a_number() {
        assertNotEquals(0, page.getNumber());
    }

    @Test
    void pageHas_date() {
        assertEquals(LocalDate.now(), page.getDate());
    }

    @Test
    void page_canBe_writtenTo_Read_andUpdated() {
        assertEquals("Day 1", page.getHeading());
        assertEquals("Just dey lavish", page.getActivitiesOfTheDay());

        page.setHeading("Na Day 2 ooo");
        page.setActivitiesOfTheDay("Kasala burst");
        assertEquals("Na Day 2 ooo", page.getHeading());
        assertEquals("Kasala burst", page.getActivitiesOfTheDay());
    }
}