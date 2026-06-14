package homework8;

/** * @author Mikheili G.
 */
public class StringToNumber {

    public static int parseSafe(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("არ არის რიცხვი: " + s);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("ტესტი 1 (\"42\"): " + parseSafe("42"));
        System.out.println("ტესტი 2 (\"abc\"): " + parseSafe("abc"));
        System.out.println("ტესტი 3 (\"\"): " + parseSafe(""));
    }
}
