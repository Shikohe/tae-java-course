package homework8;

/** * @author Mikheili G.
 */
public class InputValidator {

    public static int processAge(String input) throws NumberFormatException, IllegalArgumentException {
        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("ასაკი არ შეიძლება იყოს უარყოფითი: " + age);
        }

        return age * 12; // აბრუნებს თვეებში
    }

    public static void main(String[] args) {
        String[] testInputs = {"25", "-5", "abc"};

        for (String input : testInputs) {
            System.out.println("შემოწმება მნიშვნელობაზე: \"" + input + "\"");
            try {
                int months = processAge(input);
                System.out.println("შედეგი თვეებში: " + months);
            } catch (NumberFormatException e) {
                System.out.println("დაიჭირა NumberFormatException: ტექსტის კონვერტაცია რიცხვად ვერ მოხერხდა.");
            } catch (IllegalArgumentException e) {
                System.out.println("დაიჭირა IllegalArgumentException: " + e.getMessage());
            }
            System.out.println("------------------------------------------------");
        }
    }
}