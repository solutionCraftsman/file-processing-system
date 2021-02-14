import java.util.ArrayList;

public class FileCategory<Member> {

    private final ArrayList<File> files;

    public FileCategory() {
        this.files = new ArrayList<>();
    }

    public File[] getFiles() {
        return files.toArray(new File[0]);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public File getFileById(int fileId) {
        File fileToFind = null;

        for (File file : files) {
            if(file.getId() == fileId) {
                fileToFind = file;
                break;
            }
        }

        return fileToFind;
    }

    public void removeFile(File file) {
        files.remove(file);
    }
}
