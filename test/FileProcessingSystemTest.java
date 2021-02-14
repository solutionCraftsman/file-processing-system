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

        File file = system.openFileForNewGoldMember(goldMember);
        assertNotNull(file);
        assertEquals(file, system.getDatabase().getGoldMembersFilesCategory().getFileById(file.getId()));
    }

    @Test
    void fileCanBeOpened_forNewSilverMember() {
        SilverMember silverMember = new SilverMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = system.openFileForNewSilverMember(silverMember);
        assertNotNull(file);
        assertEquals(file, system.getDatabase().getSilverMembersFilesCategory().getFileById(file.getId()));
    }

    @Test
    void fileCanBeOpened_forNewPlatinumMember() {
        PlatinumMember platinumMember = new PlatinumMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = system.openFileForNewPlatinumMember(platinumMember);
        assertNotNull(file);
        assertEquals(file, system.getDatabase().getPlatinumMembersFilesCategory().getFileById(file.getId()));
    }

    @Test
    void cardCanBeCreated_forNewGoldMember() {
        GoldMember goldMember = new GoldMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewGoldMember(goldMember, file);
        assertNotNull(card);
    }

    @Test
    void cardCanBeCreated_forNewSilverMember() {
        SilverMember silverMember = new SilverMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewSilverMember(silverMember, file);
        assertNotNull(card);
    }

    @Test
    void cardCanBeCreated_forNewPlatinumMember() {
        PlatinumMember platinumMember = new PlatinumMember(
                "Ayo", "Dele", "Glow", "ayodele@glow.com", Gender.MALE, 2021, 1, 1
        );

        File file = new File();
        Card card = system.createCardForNewPlatinumMember(platinumMember, file);
        assertNotNull(card);
    }
}