
public class SilverMember extends Member {

    public SilverMember(String firstName, String middleName, String lastName, String emailAddress, Gender gender, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        super(firstName, middleName, lastName, emailAddress, gender, yearOfBirth, monthOfBirth, dayOfBirth);
    }

    @Override
    public void serializeDetailsToFile(File file) {
        file.setMemberCategory(MemberCategory.SILVER);
        file.setMemberDetails(this);
    }

    @Override
    public void serializeDetailsToCard(Card card) {
        card.setMemberCategory(MemberCategory.SILVER);
        card.setMemberDetails(this);
    }
}
