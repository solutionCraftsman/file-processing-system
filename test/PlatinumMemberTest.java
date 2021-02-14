import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatinumMemberTest {

    PlatinumMember platinumMember;

    @BeforeEach
    void setUp() {
        platinumMember = new PlatinumMember(
                "", "", "", "",
                null, 0, 0, 0
        );
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void detailsCan_beSerialized_toFile() {
        File file = new File();

        platinumMember.serializeDetailsToFile(file);

        assertEquals(platinumMember, file.getMemberDetails());
        assertEquals(MemberCategory.PLATINUM, file.getMemberCategory());
    }

    @Test
    void detailsCan_beSerialized_toCard() {
        Card card = new Card(new File().getId());

        platinumMember.serializeDetailsToCard(card);

        assertEquals(platinumMember, card.getMemberDetails());
        assertEquals(MemberCategory.PLATINUM, card.getMemberCategory());
    }
}