package object;

public class testToString {
    public static void main(String[] args) {
        /*
            toString()返回对象字符串形式
        */

        testToString object = new testToString();
        String s1 = object.toString();
        System.out.println(s1);

        Student stu = new Student(13,"lisi");
        String s2 = stu.toString();
        //System    类名
        //out       静态变量
        //println   方法
        //参数       要打印的内容
        //在println方法中会调用到Object的toString方法。
        //可以通过重写toString方法来改变该情况。
        System.out.println(s2);
    }
}
