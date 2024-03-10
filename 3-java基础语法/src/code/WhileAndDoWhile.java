package code;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int a = 1;
        while (a < 0){
            a++;
            System.out.println("执行了");
        }
        System.out.println(a);
        System.out.println("=========================================");
        int b = 1;
        do {
            b++;
            System.out.println("执行了");
        }while (b < 0);
        System.out.println(b);
    }
}
