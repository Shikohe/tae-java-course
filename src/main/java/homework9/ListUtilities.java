package homework9;

import java.util.Arrays;
import java.util.List;

public class ListUtilities {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kato", "Taso", "Eka");
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        printList(names);
        printList(numbers);

        System.out.println("First name: " + getFirst(names));
        System.out.println("First number: " + getFirst(numbers));
    }
}