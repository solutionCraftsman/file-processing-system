import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    Card card;

    @BeforeEach
    void setUp() {
        card = new Card(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void cardHas_anId() {
        assertEquals(5, card.getMemberId());
    }

    @Test
    void memberCategory_canBeEntered() {
        card.setMemberCategory(MemberCategory.PLATINUM);
        assertEquals(MemberCategory.PLATINUM, card.getMemberCategory());
    }

    @Test
    void memberDetails_canBeEntered() {
        PlatinumMember platinumMember = new PlatinumMember(
                "", "", "", "", null, 0, 0, 0
        );
        card.setMemberDetails(platinumMember);
        assertEquals(platinumMember, card.getMemberDetails());
    }
}