public class NumberGenerator {
    private static int number = 0;

    public static int generate() {
        return number++;
    }
}
