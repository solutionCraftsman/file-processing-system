import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileCategoryTest {

    FileCategory<Member> fileCategory;

    @BeforeEach
    void setUp() {
        fileCategory = new FileCategory<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fileCategory_hasFiles() {
        assertNotNull(fileCategory.getFiles());
    }

    @Test
    void file_canBeAdded() {
        fileCategory.addFile(new File());
        assertEquals(1, fileCategory.getFiles().length);
    }

    @Test
    void file_canBeRemoved() {
        File file = new File();
        fileCategory.addFile(file);
        assertEquals(1, fileCategory.getFiles().length);

        fileCategory.removeFile(fileCategory.getFileById(file.getId()));
        assertEquals(0, fileCategory.getFiles().length);
    }

    @Test
    void nonExistentFile_cannotBeFoundOrRemoved() {
        File file = new File();
        fileCategory.addFile(file);
        assertEquals(1, fileCategory.getFiles().length);

        fileCategory.removeFile(fileCategory.getFileById(file.getId() + 1));
        assertEquals(1, fileCategory.getFiles().length);
    }
}