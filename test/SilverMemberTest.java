import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SilverMemberTest {

    SilverMember silverMemberDetails;

    @BeforeEach
    void setUp() {
        silverMemberDetails = new SilverMember(
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

        silverMemberDetails.serializeDetailsToFile(file);

        assertEquals(silverMemberDetails, file.getMemberDetails());
        assertEquals(MemberCategory.SILVER, file.getMemberCategory());
    }

    @Test
    void detailsCan_beSerialized_toCard() {
        Card card = new Card(new File().getId());

        silverMemberDetails.serializeDetailsToCard(card);

        assertEquals(silverMemberDetails, card.getMemberDetails());
        assertEquals(MemberCategory.SILVER, card.getMemberCategory());
    }
}