package homework6;
//@author Misho Gogokhia
public class Dog extends Animal{
    public Dog(String name){
    super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+" Bark!");
    }

    public static void main(String[] args) {
        Dog canecorso = new Dog("Zeus");
        canecorso.makeSound();
    }
}
