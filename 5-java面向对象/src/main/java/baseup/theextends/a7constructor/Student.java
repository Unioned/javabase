package baseup.theextends.a7constructor;

public class Student extends Person{

    public Student(){
        super();//不写也会默认添加
//        super("z",1);
        System.out.println("子类无参构造");
    }
}
