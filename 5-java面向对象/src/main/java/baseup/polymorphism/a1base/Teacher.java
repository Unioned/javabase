package baseup.polymorphism.a1base;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师信息为:"+"name:"+getName()+",age:"+getAge());
    }
}
