//@author Misho Gogokhia
package Homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if (n > 0) {
            return "Positive";
        } else if (n < 0) {
            return "Negative";
        }

        return "Zero";
    }

    public static String classify(double n) {
        String result;

        if (n > 0) {
            result = "Positive";
        } else if (n < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }

        if (n % 1 == 0) {
            result += " · Whole double";
        } else {
            result += " · Decimal";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(classify(-5));
        System.out.println(classify(3.14));
        System.out.println(classify(7.0));
    }
}
