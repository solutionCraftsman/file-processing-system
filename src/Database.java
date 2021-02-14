import java.util.ArrayList;

public class Database {

	private final FileCategory<GoldMember> goldMembersFilesCategory;
	private final FileCategory<SilverMember> silverMembersFilesCategory;
	private final FileCategory<PlatinumMember> platinumMembersFilesCategory;

	public Database() {
		goldMembersFilesCategory = new FileCategory<>();
		silverMembersFilesCategory = new FileCategory<>();
		platinumMembersFilesCategory = new FileCategory<>();
	}

	public File[] getMembersFiles() {

		File[] goldMembersFiles = goldMembersFilesCategory.getFiles();
		File[] silverMembersFiles = silverMembersFilesCategory.getFiles();
		File[] platinumMembersFiles = platinumMembersFilesCategory.getFiles();

		int totalNumberOfFiles =
				goldMembersFiles.length +
				silverMembersFiles.length +
				platinumMembersFiles.length;

		File[] membersFiles = new File[totalNumberOfFiles];
		int indexLastCopiedTo = 0;

		System.arraycopy(goldMembersFiles, 0, membersFiles, indexLastCopiedTo, goldMembersFiles.length);
		indexLastCopiedTo = goldMembersFiles.length;

		System.arraycopy(silverMembersFiles, 0, membersFiles, indexLastCopiedTo, silverMembersFiles.length);
		indexLastCopiedTo = goldMembersFiles.length +
				silverMembersFiles.length;

		System.arraycopy(platinumMembersFiles, 0, membersFiles, indexLastCopiedTo, platinumMembersFiles.length);

		return membersFiles;
	}

	public FileCategory<GoldMember> getGoldMembersFilesCategory() {
		return goldMembersFilesCategory;
	}

	public FileCategory<SilverMember> getSilverMembersFilesCategory() {
		return silverMembersFilesCategory;
	}

	public FileCategory<PlatinumMember> getPlatinumMembersFilesCategory() {
		return platinumMembersFilesCategory;
	}
}
