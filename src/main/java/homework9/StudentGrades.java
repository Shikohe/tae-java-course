package homework9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentGrades {

    static HashMap<String, List<Integer>> grades = new HashMap<>();

    public static double averageFor(String name) {

        List<Integer> list = grades.get(name);

        int sum = 0;

        for (int grade : list) {
            sum += grade;
        }

        return (double) sum / list.size();
    }

    public static void main(String[] args) {

        grades.put("Lekso", Arrays.asList(85, 92, 78, 90));
        grades.put("Luka", Arrays.asList(70, 65, 80, 75));
        grades.put("Nika", Arrays.asList(95, 98, 92, 100));

        for (String student : grades.keySet()) {
            System.out.println(student + ": "
                    + grades.get(student)
                    + " avg=" + averageFor(student));
        }
    }
}