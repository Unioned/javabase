package string;

import java.util.Scanner;

public class CreateString {
    public static void main(String[] args) {
        //四种字符串创建方法
        String[] str = new String[4];
        //存储在堆内存中的串池中,同一个字符串的地址可以复用,每一个新字符串就会直接进行创建
        str[0] = "abc";
        //通过堆内存直接进行new方法创建对象,每次新的字符串都会独立创建一个空间
        str[1] = new String("abc");
        str[2] = new String(new char[]{'a','b','c'});
        str[3] = new String(new byte[]{97,98,99});

        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("======================================");
        String str1 = "aaa";
        String str2 = "aaa";
        String str3 = new String("aaa");
        String str4 = new String("aaa");
        System.out.println(str1==str2);
        System.out.println(str3==str4);
        System.out.println(str1==str3);
        System.out.println("======================================");
        Scanner scanner = new Scanner(System.in);
        String str5 = scanner.next();
        //底层源码可知通过输入得到的字符串是通过new方式得到的
        /*
        public static String newString(byte[] val, int index, int len) {
            if (len == 0) {
                return "";
            }
            return new String(Arrays.copyOfRange(val, index, index + len),
                              LATIN1);
        }
        */
        System.out.println(str5);
        System.out.println(str5==str1);
        System.out.println(str5==str3);
    }
}
