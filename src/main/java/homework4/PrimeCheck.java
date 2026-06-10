/**
 * @author Misho Gogokhia
 */

package homework4;

public class PrimeCheck {

    public static void main(String[] args) {
        int age = 17;
        System.out.println("[Misho Gogokhia]Task7");
        boolean isPrime = true;
        if (age <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= age / 2; i++) {
                if (age % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(age + " is prime");
        } else {
            System.out.println(age + " is not prime");
        }
    }
}