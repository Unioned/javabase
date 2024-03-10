package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchWeek {
    public static void main(String[] args) {
        int day = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个数字表示星期： ");
        try{
            day = input.nextInt();//读取一个int类型输入
        }catch (InputMismatchException ignored){}

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
