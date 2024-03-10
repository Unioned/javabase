package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        int day = 0;
        while(day != -1 ){
            Scanner input = new Scanner(System.in);
            System.out.print("输入一个数字表示星期(-1退出程序)： ");
            try{
                day = input.nextInt();//读取一个int类型输入
            }catch (InputMismatchException ignored){}//忽略catch到的异常,InputMismatchException输入数据类型不符
            //input.nextLine();//读取一个String类型的输入
            if (day == 1){
                System.out.println("Monday");
            }else if (day == 2){
                System.out.println("Tuesday");
            }else if (day == 3){
                System.out.println("Wednesday");
            }else if (day == 4){
                System.out.println("Thursday");
            }else if (day == 5){
                System.out.println("Friday");
            }else if (day == 6){
                System.out.println("Saturday");
            }else if (day == 7){
                System.out.println("Sunday");
            }else if (day == -1){
                System.out.println("进行退出");
            }else {
                System.out.println("输入有误,请输入数字1~7");
            }
        }
    }
}
