package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class testBigDecimal2 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10.1");
        BigDecimal bd2 = new BigDecimal("2.0");
        // 加
        System.out.println(bd1.add(bd2));
        // 减
        System.out.println(bd1.subtract(bd2));
        // 乘
        System.out.println(bd1.multiply(bd2));
        // 除
        BigDecimal bd3 = new BigDecimal("3.0");
        System.out.println(bd1.divide(bd2));//如果遇上除不尽的数会报错,需要定义舍入模式。
//        System.out.println(bd1.divide(bd3));
        System.out.println(bd1.divide(bd3, 2, BigDecimal.ROUND_HALF_UP));//自JDK9已过时,被废弃。
        System.out.println(bd1.divide(bd3, 2, RoundingMode.HALF_UP));
        //UP    远离零方向舍入
        //DOWN  向零方向舍入
        //CEILING   向正方向舍入
        //FLOOR     向负方向舍入
        //HALF_UP   >=0.5 进位 四舍五入
        //HALF_DOWN >0.5 进位

    }
}
