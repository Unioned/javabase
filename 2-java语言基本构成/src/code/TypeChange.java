package code;

public class TypeChange {

    public static void main(String[] args) {
        int a = 128;
        byte b = (byte)a;
        System.out.println(b);

        double x = 3.4;
        float y = (float)x;
        //（大空间->小空间）需要进行强制类型转换

        char n = 'a';
        int m = n;
        System.out.println(m);

        int f = 1;
        int l = 2;
        int sum = f++ + ++l;
        System.out.println(f);
        System.out.println(l);
        System.out.println(sum);
    }
}
