package oop.Regex.example_001;

@SuppressWarnings("WeakerAccess")
public class Regex {

    private static final String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}$";
    private static final String phoneNumberRegex = "^[0-9]{3}[-]*[0-9]{3}[-]*[0-9]{2}[-]*[0-9]{2}[-]*";

    public static boolean emailValidator(String expression) {
        return expression.matches(emailRegex);
    }

    public static boolean phoneNumberValidator(String expression) {
        return expression.matches(phoneNumberRegex);
    }
}
