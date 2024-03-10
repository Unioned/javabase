package string;

public class StringSub {
    public static void main(String[] args) {
        String str = "18274864832";
        String substring1 = str.substring(7);//4832
        String substring2 = str.substring(0, 3);//182
        System.out.println(substring2 + "****" + substring1);
    }
}
