package homework4;
//author misho gogokhia
public class EvenOddCounter {
    public static void main(String[] args) {
            int birthYear = 2004;
            int lastTwoDigits = birthYear % 100;

            int even = 0;
            int odd = 0;
        System.out.println("[Misho Gogokhia]Task4");
            for(int i=1;i<=lastTwoDigits;i++){
                if (i%2== 0){
                    even++;
                } else{
                    odd++;
                }
            }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+ odd);
    }
}
