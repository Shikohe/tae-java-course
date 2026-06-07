package homework6;

public class Student {

    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade() {

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public String getStatus() {

        if (averageGrade() >= 60) {
            return "Pass";
        }

        return "Fail";
    }

    public static void main(String[] args) {

        Student student =
                new Student("Ana", new int[]{85, 92, 78});

        System.out.println("Average: " + student.averageGrade());
        System.out.println("Status: " + student.getStatus());
    }
}