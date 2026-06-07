package homework6;

public class Car extends Vehicle {
    int doors;
    public Car(String brand,int year,int doors){
            super(brand,year);
            this.doors = doors;
    }
    @Override
    public void info(){
        System.out.println(brand+", "+year+", "+doors+"doors");
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW",2021,4);
        c1.info();
    }

}
