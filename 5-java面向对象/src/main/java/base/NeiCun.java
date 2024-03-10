package base;

public class NeiCun {

    public int ChangeNum(int x){
        System.out.println("方法执行前:"+x);
        x = 10;
        System.out.println("方法执行后:"+x);
        return x;
    }

    public static void main(String[] args) {
        //创建对象
        //0.加载类模板
        //1.通过类模板在堆内存中开辟空间
        //2.在栈内存中创建相应地址引用
        NeiCun neiCun = new NeiCun();
        //栈内存创建一个变量将常量区数字复制过来
        int a = 1;
        a = neiCun.ChangeNum(a);
        //调用方法  让方法执行一遍
        //1.方法存在哪里?      堆内存的对象空间内
        //2.方法在哪里执行?    栈内存中开辟一块临时的方法执行空间
        System.out.println("方法执行后,main方法中a的值:"+a);
    }
}
