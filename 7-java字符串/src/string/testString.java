package string;

public class testString {

    public static void main(String[] args) {
        String s1 = "abc";
        //String s2 = new String("def");
        String s2 = "def";
        String s3 = s1 + s2;
        String s4 = "abcdef";
        System.out.println(s3==s4); // false
    }
}
