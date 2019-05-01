package oop.regex;

public class Main {
    public static void main(String[] args) {
        String validEmail = "abc@gmail.com";
        String invalidEmail = "abc@gmail.0a";

        String validPhoneNumber = "212-000-00-00";
        String invalidPhoneNumber = "212-000-000-00";

        System.out.println(validEmail + ": " + Regex.emailValidator(validEmail));
        System.out.println(invalidEmail + ": " + Regex.emailValidator(invalidEmail));

        System.out.println(validPhoneNumber + ": " + Regex.phoneNumberValidator(validPhoneNumber));
        System.out.println(invalidPhoneNumber + ": " + Regex.phoneNumberValidator(invalidPhoneNumber));
    }
}
