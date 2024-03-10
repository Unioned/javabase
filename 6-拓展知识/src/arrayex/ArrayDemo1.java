package arrayex;

public class ArrayDemo1 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        double[] b = {1.23,4.56,7.89};
        String[] c = {"aaa","bbb","ccc"};
        char[] d = {'a','f','t'};

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(d.toString());

//          扩展:
//          解释地址值含义:    [D@3b07d329
//          [:表示当前是个数组
//          D:表示是一个double类型数组
//          @:表示一个间隔符号
//          3b07d329:数组的真正地址值
    }
}
