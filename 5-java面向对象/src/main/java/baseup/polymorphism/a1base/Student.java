package baseup.polymorphism.a1base;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生信息为:"+"name:"+getName()+",age:"+getAge());
    }
}
