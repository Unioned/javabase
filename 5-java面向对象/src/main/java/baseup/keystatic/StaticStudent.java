package baseup.keystatic;

public class StaticStudent {

    String name;
    int age;
    static String teacherName;

    //调用非静态方法中有传入一个隐藏的this参数,在方法中所有的非静态参数和方法( 如name,age,show() )都会默认在前加上这个this
    //this表示当前方法调用者的地址值
    //这个this是由虚拟机赋值的,不能通过操作方法传入的参数来改变
    public void show1(StaticStudent this){
        System.out.println("this:"+this);
        System.out.println(name + "," + age + "," + teacherName);
        show2();
    }

    public void show2(){
        System.out.println("show2");
    }

//    强行在静态方法中加入接收StaticStudent this参数,会报错,显示无法引用。
/*    public static void method(){
         System.out.println("静态方法");
    }*/
}
