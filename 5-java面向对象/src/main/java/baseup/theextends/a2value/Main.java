package baseup.theextends.a2value;

public class Main {
    //私有变量是可以被继承的(由于通过this的getter方法是可以调用的),但是由于是私有,是无法被直接调用到的。
    //需要一个私有变量对应的非私有的getter和setter方法才能进行间接取值和赋值。
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.gender = "男";
        zi.name = "李四";
        zi.setAge(12);
        System.out.println(zi);
    }
}
