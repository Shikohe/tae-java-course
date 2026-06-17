package homework9;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}

public class GenericBox {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>("Hello");
        Box<Integer> box2 = new Box<>(42);
        Box<Double> box3 = new Box<>(3.14);

        System.out.println("String box: " + box1.get());
        System.out.println("Integer box: " + box2.get());
        System.out.println("Double box: " + box3.get());
    }
}