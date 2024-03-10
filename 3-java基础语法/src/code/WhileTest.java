package code;

public class WhileTest {

    public static void main(String[] args) {
        int total = 1020;
        int day = 0;
        while (total > 0){
            total /= 2;
            total -= 2;
            day++;
            System.out.println("第"+day+"天剩下了"+total+"个瓜");
        }
        System.out.println(day);
    }
}
