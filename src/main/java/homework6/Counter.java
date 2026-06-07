package homework6;

public class Counter {
    int count;
    int maxValue;
    public Counter(int maxValue) {
        this.maxValue = maxValue;
        this.count = 0;
    }

    public void increment(){
        if (count<maxValue){
            count += 1;
        }
    }
    public void reset(){
        count = 0;
    }
    public void countTo(int target){
        for (int i=1;i<=target;i++){
            increment();
        }
    }
    public static void main(String[] args) {
        Counter c = new Counter(7);
        c.countTo(5);
        System.out.println(c.count);
    }
}
