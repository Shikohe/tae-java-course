package homework4;
//author misho gogokhia
public class Calculator {
    public static void main(String[] args) {
        double a = 50;
        double b = 10;
        char op = 'a';
        System.out.println("[Misho Gogokhia] Task2");
        switch (op){
            case '-':
                System.out.println(a-b);
                break;

            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b == 0){
                    System.out.println("can't divide by 0");
                }
                else {
                    System.out.println(a/b);
                }
                break;
            default:
                System.out.println("Unknown operator");

                }
        }
    }

