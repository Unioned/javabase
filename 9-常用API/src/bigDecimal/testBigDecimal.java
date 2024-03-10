package bigDecimal;

import java.math.BigDecimal;

public class testBigDecimal {
    //bigDecimal底部存储是通过byte数组存储ASCII码值来对小数进行精确存储。
    /*
    构造方法获取bigDecimal数
    BigDecimal(String s)
    BigDecimal(int i)       可能不精确

    BigDecimal.ValueOf(...)
    */
    public static void main(String[] args) {
//        一般浮点数运算
        System.out.println(0.09 + 0.01);
        System.out.println(0.216 - 0.1);
        System.out.println(0.44 * 0.1);
        System.out.println(0.09 / 0.1);
        System.out.println("-----------------------------------");

        BigDecimal bd1 = new BigDecimal("0.01");
        BigDecimal bd2 = new BigDecimal(0.01);

        System.out.println(bd1);
        System.out.println(bd2);

        //bigDecimal进行精确运算
        BigDecimal bd3 = new BigDecimal("0.09");
        BigDecimal bd4 = bd3.add(bd1);
        System.out.println(bd4);
        BigDecimal bd5 = bd3.add(bd2);
        System.out.println(bd5);
        System.out.println("----------------------------------");
        //静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        System.out.println(bd6 + " " + bd7 + " " + bd8);
        System.out.println(bd6==bd7);
        System.out.println(bd6==bd8);

        //注意：
        //1.数字未超出double范围使用BigDecimal.valueOf,超出double范围使用字符串构造方法。
        //2.在valueOf方法中传递的为[0,10]的整数,就会返回创建好的对象,不用重新new。
    }
}
