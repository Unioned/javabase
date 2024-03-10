package code;

public class DoWhileTest {
    public static void main(String[] args) {
        int total = 1020;
        int day = 0;
        do{
            total /= 2;
            total -= 2;
            day++;
            System.out.println("第"+day+"天剩下了"+total+"个瓜");
        }while (total > 0);
        System.out.println(day);
    }
}
