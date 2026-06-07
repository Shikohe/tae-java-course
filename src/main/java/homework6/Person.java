package homework6;
//@author Misho Gogokhiac

public class Person {
    private String name;
    private int age;
    private String email;
    public Person(String name,int age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public void introduce(){
        System.out.println("გამარჯობა, მე ვარ "+name+"."+age+" წლის.");
    }

    public static void main(String[] args) {
        Person p = new Person("ელენე",30,"elenedariani@gmail.com");
        Person me = new Person("მიშო",22,"mikheilgogokhia@credo.ge");

        p.introduce();
        me.introduce();
    }
}
