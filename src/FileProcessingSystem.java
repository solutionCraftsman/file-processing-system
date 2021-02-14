public class FileProcessingSystem {
	
	private final Database database;
	
	public FileProcessingSystem(){
		database = new Database();
	}
	
	public Database getDatabase() {
		return database;
	}

	public int openFileForNewGoldMember(GoldMember goldMember) {
		File file = new File();
		goldMember.serializeDetailsToFile(file);
		addFileToGoldMembersFilesCategory(file);

		return file.getId();
	}

	public Card createCardForNewGoldMember(GoldMember goldMember, int fileId) {
		Card card = new Card(fileId);
		goldMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToGoldMembersFilesCategory(File file) {
		database.getGoldMembersFilesCategory().addFile(file);
	}

	public int openFileForNewSilverMember(SilverMember silverMember) {
		File file = new File();
		silverMember.serializeDetailsToFile(file);
		addFileToSilverMembersFilesCategory(file);

		return file.getId();
	}

	public Card createCardForNewSilverMember(SilverMember silverMember, int fileId) {
		Card card = new Card(fileId);
		silverMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToSilverMembersFilesCategory(File file) {
		database.getSilverMembersFilesCategory().addFile(file);
	}

	public int openFileForNewPlatinumMember(PlatinumMember platinumMember) {
		File file = new File();
		platinumMember.serializeDetailsToFile(file);
		addFileToPlatinumMembersFilesCategory(file);

		return file.getId();
	}

	public Card createCardForNewPlatinumMember(PlatinumMember platinumMember, int fileId) {
		Card card = new Card(fileId);
		platinumMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToPlatinumMembersFilesCategory(File file) {
		database.getPlatinumMembersFilesCategory().addFile(file);
	}
}
