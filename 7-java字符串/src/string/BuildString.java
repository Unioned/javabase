package string;

public class BuildString {
    public static void main(String[] args) {
        //stringBuilder对象中的字符串是可变的,可以节省那种反复变化的字符串的空间开销
        //使用StringBuilder的场景
        //1.字符串拼接
        //2.字符串反转
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        int length = sb.length();
        System.out.println(length);

        String s = sb.toString();
        System.out.println(s);

    }
}
