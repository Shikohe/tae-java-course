package homework4;
//author misho gogokhia

public class Factorial {
    public static void main(String[] args) {
        int birthMonth = 6;
        long factorial = 1;
        System.out.println("[Misho Gogokhia]Task5");
        for (int i=1;i<=birthMonth;i++){
            factorial *= i;
        }
        System.out.println(birthMonth+"!= " + factorial);
    }
}
