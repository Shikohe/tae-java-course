package homework8;

/** * @author Mikheili G.
 */
public class MultiCatchDemo {

    public static void processInput(String input) {
        try {
            int result = Integer.parseInt(input);
            int[] arr = {10, 20};
            int divisionValue = arr[result] / result;
            System.out.println("შედეგი: " + divisionValue);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: არასწორი რიცხვის ფორმატი! -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("შეცდომა: ინდექსი მასივის ფარგლებს გარეთაა! -> " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("შეცდომა: არითმეტიკული შეცდომა (ალბათ ნულზე გაყოფა)! -> " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("processInput(\"abc\") -> ");
        processInput("abc");

        System.out.print("processInput(\"0\") -> ");
        processInput("0");

        System.out.print("processInput(\"99\") -> ");
        processInput("99");
    }
}