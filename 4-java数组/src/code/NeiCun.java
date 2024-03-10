package code;

public class NeiCun {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 100;
        System.out.println(a);

        System.out.println("---------------------------------");

        int[] x = {10,20,30};
        //(等同于new int[]{10,20,30},相当new了一个对象)
        //new操作相当于在堆内存内开辟一块新的空间
        //数组在堆内存中的空间形态就是一串连续的地址
        //基本类型在变量空间中存储的是值,传的是值,一个改变另一个不会变化
        //引用类型在变量空间中存储的是地址(引用),传递的是这个引用,一个改变另一个也会跟着变化
        int[] y = x;
        y[0] = 100;
        System.out.println(x[0]);
    }
}
