package homework9;

import java.util.ArrayList;
import java.util.List;

public class NumberStats {

    public static int findMax(List<Integer> list) {
        int max = list.get(0);

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(List<Integer> list) {
        int min = list.get(0);

        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double average(List<Integer> list) {
        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Average: " + average(numbers));
    }
}