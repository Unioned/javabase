package objects;

import java.util.Objects;

public class testObjects {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student(22,"ZhangSan");

        if (s1 == null && s2 != null){
            System.out.println(false);
        }else {
            System.out.println(s1.equals(s2));
        }

        System.out.println(Objects.equals(s1, s2));
        //源码：return (a == b) || (a != null && a.equals(b));
        // 细节:
        //1.方法的底层会判断s1是否为null，如果为null，直接返回false
        //2.如果s1不为null，那么就利用s1再次调用equals方法
        //3.此时s1是student类型，所以最终还是会调用student中的equals方法。
        //如果没有重写，比较地址值，如果重写了，就比较属性值。

        //为空返回true,非空返回false
        System.out.println("isnull:");
        System.out.println("s1:"+Objects.isNull(s1));
        System.out.println("s2:"+Objects.isNull(s2));
        //为空返回false,非空返回true
        System.out.println("nonnull:");
        System.out.println("s1:"+Objects.nonNull(s1));
        System.out.println("s2:"+Objects.nonNull(s2));
    }
}
