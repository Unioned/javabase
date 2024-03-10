package baseup.innerclass.staticinnerclass;

public class Outer {
    int a = 10;
    static int b = 20;

    //静态内部类
    static class Inner{
        public void show1(){
            Outer outer = new Outer();
            System.out.println(outer.a);//如果想要访问非静态的需要创建对象。
            System.out.println(b);
            System.out.println("非静态方法被调用了");
        }

        public static void show2(){
            Outer outer = new Outer();
            System.out.println(outer.a);
            System.out.println(b);
            System.out.println("静态方法被调用了");
        }
    }
}

class Test{
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();// 创建静态内部类对象
        oi.show1();
        Outer.Inner.show2();// 调用静态方法
    }

}