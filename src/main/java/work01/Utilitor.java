package work01;

public class Utilitor {

    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException("Value can't be null");
        }

        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("Value can't be blank");
        }

        return value;
    }

    public static double testPositive(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Must be a positive number or more than 0");
        }

        return value;
    }

    public static long computeIsbn10(long isbn10) {
        if (isbn10 <= 0 || isbn10 > 999999999) {
            throw new IllegalArgumentException("Must be a 9 digit number");
        }

        int sum = 0;
        int weight = 10;

        while (isbn10 > 0) {
            int digit = (int) (isbn10 % 10);
            sum += digit * weight;
            isbn10 /= 10;
            weight--;
        }

        int checkDigit = (11 - (sum % 11)) % 11;

        return checkDigit;
    }

}
