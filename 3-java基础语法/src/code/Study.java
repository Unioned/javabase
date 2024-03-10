package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study {

    public static void main(String[] args) {
        int day = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("输入日期为你安排日程： ");
        try{
            day = input.nextInt();//读取一个int类型输入
        }catch (InputMismatchException ignored){}
        switch (day){
            case 1:
            case 3:
            case 5:
                System.out.println("学习编程");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("学习英语");
                break;
            case 7:
                System.out.println("进行休息");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
