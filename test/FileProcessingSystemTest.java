import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessingSystemTest {

    FileProcessingSystem system;

    @BeforeEach
    void setUp() {
        system = new FileProcessingSystem();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void systemHasADatabase() {
        Database database = system.getDatabase();
        assertNotNull(database);
    }

    @Test
    void fileCanBeOpened_forNewGoldMember() {
        GoldMember goldMember = new GoldMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        int fileId = system.openFileForNewGoldMember(goldMember);
        File openedFile = system.getDatabase().getGoldMembersFilesCategory().getFileById(fileId);

        assertNotNull(openedFile);
        assertEquals(MemberCategory.GOLD, openedFile.getMemberCategory());
        assertEquals(goldMember, openedFile.getMemberDetails());
    }

    @Test
    void fileCanBeOpened_forNewSilverMember() {
        SilverMember silverMember = new SilverMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        int fileId = system.openFileForNewSilverMember(silverMember);
        File openedFile = system.getDatabase().getSilverMembersFilesCategory().getFileById(fileId);

        assertNotNull(openedFile);
        assertEquals(MemberCategory.SILVER, openedFile.getMemberCategory());
        assertEquals(silverMember, openedFile.getMemberDetails());
    }

    @Test
    void fileCanBeOpened_forNewPlatinumMember() {
        PlatinumMember platinumMember = new PlatinumMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        int fileId = system.openFileForNewPlatinumMember(platinumMember);
        File openedFile = system.getDatabase().getPlatinumMembersFilesCategory().getFileById(fileId);

        assertNotNull(openedFile);
        assertEquals(MemberCategory.PLATINUM, openedFile.getMemberCategory());
        assertEquals(platinumMember, openedFile.getMemberDetails());
    }

    @Test
    void cardCanBeCreated_forNewGoldMember() {
        GoldMember goldMember = new GoldMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewGoldMember(goldMember, file.getId());

        assertNotNull(card);
        assertEquals(file.getId(), card.getMemberId());
        assertEquals(MemberCategory.GOLD, card.getMemberCategory());
        assertEquals(goldMember, card.getMemberDetails());
    }

    @Test
    void cardCanBeCreated_forNewSilverMember() {
        SilverMember silverMember = new SilverMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewSilverMember(silverMember, file.getId());

        assertNotNull(card);
        assertEquals(file.getId(), card.getMemberId());
        assertEquals(MemberCategory.SILVER, card.getMemberCategory());
        assertEquals(silverMember, card.getMemberDetails());
    }

    @Test
    void cardCanBeCreated_forNewPlatinumMember() {
        PlatinumMember platinumMember = new PlatinumMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewPlatinumMember(platinumMember, file.getId());

        assertNotNull(card);
        assertEquals(file.getId(), card.getMemberId());
        assertEquals(MemberCategory.PLATINUM, card.getMemberCategory());
        assertEquals(platinumMember, card.getMemberDetails());
    }
}