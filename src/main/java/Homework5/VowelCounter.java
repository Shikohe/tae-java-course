//@author Misho Gogokhia
package Homework5;

public class VowelCounter {
    public static int countVowels(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Misho Gogokhia"));
    }
}
