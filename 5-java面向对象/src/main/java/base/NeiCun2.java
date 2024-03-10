package base;

public class NeiCun2 {

    public void ChangeNum(int[] x){
        System.out.println("方法执行前:"+x[0]);
        x[0] = 10;
        System.out.println("方法执行后:"+x[0]);
    }

    public static void main(String[] args) {
        NeiCun2 neiCun = new NeiCun2();
        int[] a = {1,2,3};//注意引用数据类型中变量一般存储的为地址(除String和包装类等)
        neiCun.ChangeNum(a);
        System.out.println("方法执行后,main方法中a的值:"+a[0]);
        //方法调用传入的是地址,所以方法中x[]改变的数组,和a[]数组有共同的地址指向
        //因此达到了可以通过void方法改变值的效果
    }
}
