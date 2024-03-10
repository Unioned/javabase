package test;

import java.lang.reflect.Field;

public class tess {
    public static void main(String[] args) throws Exception {
        String a = "AAA";
        Class<? extends String> clz = a.getClass();
        //需要使用getDeclaredField(), getField()只能获取公共成员字段
        Field field = clz.getDeclaredField("value");
        field.setAccessible(true);
        char[] ch =(char[])field.get(a);
        ch[0] = 'B';
        System.out.println(a);
    }
}
