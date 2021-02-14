
public class Card {
    private final int memberId;
    private MemberCategory memberCategory;
    private Member memberDetails;

    public Card(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberCategory(MemberCategory memberCategory) {
        this.memberCategory = memberCategory;
    }

    public void setMemberDetails(Member memberDetails) {
        this.memberDetails = memberDetails;
    }

    public MemberCategory getMemberCategory() {
        return memberCategory;
    }

    public Member getMemberDetails() {
        return memberDetails;
    }
}
