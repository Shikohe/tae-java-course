package homework8;

/** * @author Mikheili G.
 */
public class AgeValidator {

    public static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("ასაკი არასწორია: " + age + ". უნდა იყოს 0-დან 150-მდე.");
        }
        System.out.println("ასაკი ვალიდურია: " + age);
    }

    public static void main(String[] args) {
        int[] testAges = {25, -5, 200};

        for (int age : testAges) {
            try {
                System.out.println("ვამოწმებ ასაკს: " + age);
                validate(age);
            } catch (InvalidAgeException e) {
                System.out.println("დაიჭირა Custom Exception: " + e.getMessage());
            }
            System.out.println("-------------------------");
        }
    }
}