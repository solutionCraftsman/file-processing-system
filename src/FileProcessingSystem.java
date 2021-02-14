public class FileProcessingSystem {
	
	private final Database database;
	
	public FileProcessingSystem(){
		database = new Database();
	}
	
	public Database getDatabase() {
		return database;
	}

	public File openFileForNewGoldMember(GoldMember goldMember) {
		File file = new File();
		goldMember.serializeDetailsToFile(file);
		addFileToGoldMembersFilesCategory(file);

		return file;
	}

	public Card createCardForNewGoldMember(GoldMember goldMember, File file) {
		Card card = new Card(file.getId());
		goldMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToGoldMembersFilesCategory(File file) {
		database.getGoldMembersFilesCategory().addFile(file);
	}

	public File openFileForNewSilverMember(SilverMember silverMember) {
		File file = new File();
		silverMember.serializeDetailsToFile(file);
		addFileToSilverMembersFilesCategory(file);

		return file;
	}

	public Card createCardForNewSilverMember(SilverMember silverMember, File file) {
		Card card = new Card(file.getId());
		silverMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToSilverMembersFilesCategory(File file) {
		database.getSilverMembersFilesCategory().addFile(file);
	}

	public File openFileForNewPlatinumMember(PlatinumMember platinumMember) {
		File file = new File();
		platinumMember.serializeDetailsToFile(file);
		addFileToPlatinumMembersFilesCategory(file);

		return file;
	}

	public Card createCardForNewPlatinumMember(PlatinumMember platinumMember, File file) {
		Card card = new Card(file.getId());
		platinumMember.serializeDetailsToCard(card);

		return card;
	}

	private void addFileToPlatinumMembersFilesCategory(File file) {
		database.getPlatinumMembersFilesCategory().addFile(file);
	}
}
