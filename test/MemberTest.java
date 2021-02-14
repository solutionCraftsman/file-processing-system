import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member member;

    @BeforeEach
    void setUp() {
        member = new Member("Ayo", "Del", "Glow",
                "ayoDel@glow.com", Gender.MALE, 2021, 1, 1) {
            @Override
            public void serializeDetailsToFile(File file) {}
            @Override
            public void serializeDetailsToCard(Card card) {}
        };
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void memberDetails_canBeInitialized() {
        assertEquals("Ayo", member.getFirstName());
        assertEquals("Del", member.getMiddleName());
        assertEquals("Glow", member.getLastName());
        assertEquals("ayoDel@glow.com", member.getEmailAddress());
        assertEquals(Gender.MALE, member.getGender());
        assertEquals(LocalDate.of(2021, 1, 1), member.getDateOfBirth());
    }

    @Test
    void memberDetails_canBeUpdated() {
        member.setFirstName("Solution");
        member.setMiddleName("");
        member.setLastName("Craftsman");
        member.setEmailAddress("solution@craftsman.com");
        member.setGender(Gender.FEMALE);
        member.setDateOfBirth(2021, 2, 2);

        assertEquals("Solution", member.getFirstName());
        assertEquals("", member.getMiddleName());
        assertEquals("Craftsman", member.getLastName());
        assertEquals("solution@craftsman.com", member.getEmailAddress());
        assertEquals(Gender.FEMALE, member.getGender());
        assertEquals(LocalDate.of(2021, 2, 2), member.getDateOfBirth());
    }

    @Test
    void memberCan_haveACard() {
        assertNull(member.getCard());
        Card card = new Card(1);
        member.setCard(card);
        assertEquals(card, member.getCard());
    }

    @Test
    void memberCan_haveEmptyDetails() {
        Member emptyMemberDetails = new Member() {
            @Override
            public void serializeDetailsToFile(File file) {}
            @Override
            public void serializeDetailsToCard(Card card) {}
        };

        assertEquals("", emptyMemberDetails.getFirstName());
        assertEquals("", emptyMemberDetails.getMiddleName());
        assertEquals("", emptyMemberDetails.getLastName());
        assertEquals("", emptyMemberDetails.getEmailAddress());
        assertNull(emptyMemberDetails.getGender());
        assertNull(emptyMemberDetails.getDateOfBirth());
    }
}