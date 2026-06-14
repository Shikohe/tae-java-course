package homework8;

/** * @author Mikheili G.
 */
public class FinallyDemo {

    public static int readNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("შეცდომა: ფორმატის პრობლემა კლასში FinallyDemo");
            return -1;
        } finally {
            System.out.println("დასრულდა readNumber");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- ტესტი 1 (\"100\") ---");
        int res1 = readNumber("100");
        System.out.println("დაბრუნებული მნიშვნელობა: " + res1);

        System.out.println("\n--- ტესტი 2 (\"xyz\") ---");
        int res2 = readNumber("xyz");
        System.out.println("დაბრუნებული მნიშვნელობა: " + res2);
    }
}