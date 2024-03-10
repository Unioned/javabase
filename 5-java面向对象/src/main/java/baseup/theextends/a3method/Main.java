package baseup.theextends.a3method;

public class Main {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z);
        z.ziShow();
        z.fuShow1();
//        z.fuShow2();  该方法调用会报错,显示private无法调用
    }
}
