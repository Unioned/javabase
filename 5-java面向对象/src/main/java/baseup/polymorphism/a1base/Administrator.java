package baseup.polymorphism.a1base;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员信息为:"+"name:"+getName()+",age:"+getAge());
    }
}
