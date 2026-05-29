package homework4;
//author Misho Gogokhia
public class PatternPrinter {
    public static void main(String[] args) {
        String name = "Lestamberi";
        System.out.println("[Misho Gogokhia] Task3");
        for (int i = 1; i<=name.length();i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}
