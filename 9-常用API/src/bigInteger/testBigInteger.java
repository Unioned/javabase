package bigInteger;

import java.math.BigInteger;
import java.util.Random;

public class testBigInteger {
    public static void main(String[] args) {
        /*
        public BigInteger(int num,Random rnd)       获取随机大整数,范围：[0~2的num次方 - 1]
        public BigInteger(String val)               获取指定大整数
        public BigInteger( string val, int radix)   获取指定进制的大整数
        public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
        细节: 对象一旦创建里面的数据不能发生改变。计算产生的结果是新产生的对象
        */

        //1.获取随机大整数
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            BigInteger bd1 = new BigInteger(4,random);
            System.out.print(bd1+" ");
        }
        System.out.println();

        //2.获取指定整数(注：只能是整数)
        BigInteger bigInteger = new BigInteger("21474836490000000000");
//        BigInteger bigInteger1 = new BigInteger("2147.2");
        System.out.println(bigInteger);

        //3.获取指定进制的大整数
        //数字需要为整数,字符串数字必须小于进制,否则会报错
        BigInteger bi1 = new BigInteger("100",16);
        System.out.println(bi1);

        //4.valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
        //最大值只能到long类型的最大值，否则会报错
        //源码接收类型：public static BigInteger valueOf(long val)
        //Long.MAX_VALUE = 9223372036854775807
        //优化方式：内部对常用数字 -16~16提前创建好对象,多次获取不会创建新对象
        BigInteger bi2 = BigInteger.valueOf(9223372036854775807L);
        System.out.println(bi2);

        BigInteger bi3 = BigInteger.valueOf(16);
        BigInteger bi4 = BigInteger.valueOf(16);
        System.out.println(bi3 == bi4);//true
        BigInteger bi5 = BigInteger.valueOf(17);
        BigInteger bi6 = BigInteger.valueOf(17);
        System.out.println(bi5 == bi6);//false

        BigInteger bi7 = BigInteger.valueOf(2);
        BigInteger bi8 = BigInteger.valueOf(3);
        //详见源码：
        //if (val.signum == signum)
        //  eturn new BigInteger(add(mag, val.mag), signum);
        BigInteger result = bi7.add(bi8);
        System.out.println(bi7);
        System.out.println(result == bi7);//false
        System.out.println(result == bi8);//false
        System.out.println(result);
    }
}
