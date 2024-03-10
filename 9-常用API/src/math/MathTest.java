package math;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(2));//2
        System.out.println(Math.abs(-2));//2
        //当为int最小值时,abs方法会有bug
        System.out.println(Math.abs(-2147483648));//-2147483648
        //使用absExact方法则对此int最小值数据进行了特判,抛出了一个异常
//        System.out.println(Math.absExact(-2147483648));
        System.out.println("=========================================================");

        //就是向数轴的正方向取一个最近的整数
        System.out.println(Math.ceil(12.34));//13.0
        System.out.println(Math.ceil(12.54));//13.0
        System.out.println(Math.ceil(-12.34));//-12.0
        System.out.println(Math.ceil(-12.54));//-12.0
        System.out.println("=========================================================");

        //就是向数轴的负方向取一个最近的整数
        System.out.println(Math.floor(12.34));//12.0
        System.out.println(Math.floor(12.54));//12.0
        System.out.println(Math.floor(-12.34));//-13.0
        System.out.println(Math.floor(-12.54));//-13.0
        System.out.println("========================================================");

        //寻找数轴上离这个数最近的整数
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13
        System.out.println("=========================================================");
        //返回一个最大值
        System.out.println(Math.max(2, 3));//3
        //返回一个最小值
        System.out.println(Math.min(2, 3));//2
        //也可以直接三元运算符进行比较,这也是Math类中对这个方法的底层实现。
        System.out.println("=========================================================");
        //获取a的b次幂
        System.out.println(Math.pow(2, 2));//4.0
        System.out.println(Math.pow(4, 0.5));//2.0
        System.out.println(Math.pow(2, -2));//0.25
        //开平方根
        System.out.println(Math.sqrt(4));//2.0
        //开立方根
        System.out.println(Math.cbrt(8));//2.0
        System.out.println("=========================================================");
        for (int i = 0 ; i < 10 ; i++) {
            //返回一个[0,1)之间的随机数,实际上是调用ava.util.random包下的Random的对象进行的实现
            System.out.println(Math.random());
        }
    }
}