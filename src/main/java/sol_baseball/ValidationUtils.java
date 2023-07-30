package sol_baseball;

public class ValidationUtils {

    private static final int MAX_NO = 9;
    private static final int MIN_NO = 1;

    public static boolean validNo(int no) {
        return no >= MIN_NO && no <= MAX_NO;
    }
}
