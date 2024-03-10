package code;

public class TestBreakAndContinue {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        outer:for (;i <= 5 ; i++){
            for (; j <= 5; j++) {
                if (j == 3) {
                    break outer;//直接中断外层循环,即停止嵌套循环
                }
                System.out.println("hello world");
            }
        }
        System.out.println(i);
        System.out.println(j);

        System.out.println("================================================");

        int a = 1;
        int b = 1;
        outer:for (;a <= 5 ; a++){
            for (; b <= 5; b++) {
                if (b == 3) {
                    continue outer;//直接中断外层循环本次操作
                }
                System.out.println("hello world");
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
