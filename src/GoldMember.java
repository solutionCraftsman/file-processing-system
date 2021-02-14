
public class GoldMember extends Member {

    public GoldMember(String firstName, String middleName, String lastName, String emailAddress, Gender gender, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        super(firstName, middleName, lastName, emailAddress, gender, yearOfBirth, monthOfBirth, dayOfBirth);
    }

    @Override
    public void serializeDetailsToFile(File file) {
        file.setMemberCategory(MemberCategory.GOLD);
        file.setMemberDetails(this);
    }

    @Override
    public void serializeDetailsToCard(Card card) {
        card.setMemberCategory(MemberCategory.GOLD);
        card.setMemberDetails(this);
    }
}
