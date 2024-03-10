package bigInteger;

import java.math.BigInteger;

public class testBigInteger2 {
    public static void main(String[] args) {
        /*
        public BigInteger add(BigInteger val)   加法
        public BigInteger subtract(BigInteger val)  减法
        public BigInteger multiply(BigInteger val)  乘法
        public BigInteger divide( BigInteger val)   除法，获取商
        pub噔c BigInteger[] divideAndRemainder(BigInteger val)除法，获取商和余数
        public boolean equals(object x) 比较是否相同
        public BigInteger pow(int exponent) 次幂
        publicBigInteger max /min(BigInteger val)   返回较大值/较小值
        public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        //bigInteger储存原理,每一个数字有一个int数组和一个正负值标识,int数组可以用来记录数值大小,
        //每一个数组单元都可以存储2^32个数，通过每个数组单元的二进制来计算总值，所以两个数组单元就有2^64个数来计算，所以基本上用不完，

        //创建对象
        BigInteger  bi1 = BigInteger.valueOf(17);
        BigInteger  bi2 = BigInteger.valueOf(7);
        //加法
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);
        //除法,获取商和余数
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //比较相同
        BigInteger  bir = BigInteger.valueOf(17);
        boolean equal1 = bi1.equals(bi2);
        boolean equal2 = bi1.equals(bir);
        System.out.println(equal1);
        System.out.println(equal2);
        //次幂
        BigInteger bi4 = bi1.pow(2);
        System.out.println(bi4);
        //max,直接返回地址.
        BigInteger bi5 = bi1.max(bi2);
        System.out.println(bi5);
        //转型
        int ib = bi1.intValue();
        long  lb = bi1.longValue();
        System.out.println(ib);
        System.out.println(lb);
    }
}
