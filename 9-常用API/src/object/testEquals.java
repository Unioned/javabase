package object;

public class testEquals {
    public static void main(String[] args) {
        /*
            equals()比较两个对象是否相等
        */
        //未重写方法时返回值为false,因为会调用父类Object的方法,父类的equals方法使用的是比较两者地址值
        //重写equal使其可以比较其中的内容
        Student stu1 = new Student(23,"zhangSan");
        Student stu2 = new Student(23,"zhangSan");
        System.out.println(stu1.equals(stu2));

        String s1 = "abc";
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println(s1.equals(s2));  //false
        //s为字符串,字符串调用的equals被重写过,
        //重写的方法会先比较是否为同一对象,在比较是否为字符串类型,最后比较其中的内容
        //然而StringBuilder显然不是String同一对象。
        System.out.println(s2.equals(s1));  //false
        //s2为StrBuilder对象,该对象中及其父类中没有对方法equals进行过重写
        //调用的就是Object类的equals方法,此时比较的就是两者的地址,地址不同返回false
    }
}
