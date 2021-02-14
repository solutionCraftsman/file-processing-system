import java.time.LocalDate;

public abstract class Member {

    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddress;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Card card;

    public abstract void serializeDetailsToFile(File file);
    public abstract void serializeDetailsToCard(Card card);

    public Member() {
        this("", "", "", "", null, 0, 0, 0);
    }

    public Member(String firstName, String middleName, String lastName, String emailAddress, Gender gender, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;

        if((yearOfBirth != 0) && (monthOfBirth != 0) && (dayOfBirth != 0)) {
            this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
