package homework9;

import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> numbers = new HashSet<>();

        for (int num : arr) {
            numbers.add(num);
        }

        System.out.println("Unique: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 3? " + numbers.contains(3));
        System.out.println("Contains 10? " + numbers.contains(10));
    }
}