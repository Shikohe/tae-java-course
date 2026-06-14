package homework8;

/** * @author Mikheili G.
 */
public class NullCheck {

    public static int safeLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("null სტრიქონი");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("ტესტი 1 (\"Hello\"): " + safeLength("Hello"));
        System.out.println("ტესტი 2 (null): " + safeLength(null));
    }
}