package baseup.theextends.a7constructor;

public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("父类构造方法");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name+"  "+age);
    }
}
