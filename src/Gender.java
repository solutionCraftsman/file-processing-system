
public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        return super.toString().charAt(0) +
                super.toString().substring(1).toLowerCase();
    }
}
