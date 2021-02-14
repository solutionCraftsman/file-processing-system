import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldMemberTest {

    GoldMember goldMemberDetails;

    @BeforeEach
    void setUp() {
        goldMemberDetails = new GoldMember(
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

        goldMemberDetails.serializeDetailsToFile(file);

        assertEquals(goldMemberDetails, file.getMemberDetails());
        assertEquals(MemberCategory.GOLD, file.getMemberCategory());
    }

    @Test
    void detailsCan_beSerialized_toCard() {
        Card card = new Card(new File().getId());

        goldMemberDetails.serializeDetailsToCard(card);

        assertEquals(goldMemberDetails, card.getMemberDetails());
        assertEquals(MemberCategory.GOLD, card.getMemberCategory());
    }
}