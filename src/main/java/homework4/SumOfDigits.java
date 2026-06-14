package homework4;
//author misho gogokhia
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("[Misho Gogokhia]Task6");
        int year = 2004;
        int sum = 0;

        while (year > 0) {

            sum += year % 10;
            year /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
