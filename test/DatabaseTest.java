import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    Database database;
    
    @BeforeEach
    void setUp() {
        database = new Database();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void databaseHas_allMembersFiles() {
        File[] memberFiles = database.getMembersFiles();
        assertNotNull(memberFiles);
        assertEquals(0, memberFiles.length);

        database.getGoldMembersFilesCategory().addFile(new File());
        database.getSilverMembersFilesCategory().addFile(new File());
        database.getPlatinumMembersFilesCategory().addFile(new File());

        assertEquals(3, database.getMembersFiles().length);
    }

    @Test
    void databaseHas_goldMembers_filesCategory() {
        FileCategory<GoldMember> goldMembersFilesCategory = database.getGoldMembersFilesCategory();
        assertNotNull(goldMembersFilesCategory);
        assertEquals(0, goldMembersFilesCategory.getFiles().length);
    }

    @Test
    void databaseHas_silverMembers_filesCategory() {
        assertNotNull(database.getSilverMembersFilesCategory());
        assertEquals(0,
                database.getSilverMembersFilesCategory().getFiles().length);
    }

    @Test
    void databaseHas_platinumMembers_filesCategory() {
        assertNotNull(database.getPlatinumMembersFilesCategory());
        assertEquals(0,
                database.getPlatinumMembersFilesCategory().getFiles().length);
    }
}