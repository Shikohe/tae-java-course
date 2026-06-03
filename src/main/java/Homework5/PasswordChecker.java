package Homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {
        boolean hasDigit = false;
        boolean hasUppercase = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
        }

        return password.length() >= 8 && hasDigit && hasUppercase;
    }

    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));
        System.out.println(isStrong("hello"));
        System.out.println(isStrong("HELLO123"));
    }
}
