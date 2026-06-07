package homework6;
//@author Misho Gogokhia
public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("არასაკმარისი თანხა");
        }
        else{
            balance -= amount;
        }
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Bidzina",100);
        acc.deposit(10000000.0);
        System.out.println(acc.getBalance());
    }
}
