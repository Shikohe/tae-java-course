package homework8;

/** * @author Mikheili G.
 */
public class ArrayReader {

    public static int readSafe(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("არასწორი ინდექი: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};

        System.out.println("სწორი ინდექსი (1): " + readSafe(nums, 1));
        System.out.println("არასწორი ინდექსი (10): " + readSafe(nums, 10));
    }
}