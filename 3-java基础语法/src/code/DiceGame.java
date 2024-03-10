package code;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("买大买小，买定离手!");
        System.out.print("你的输入(大/小):");
        String choose = input.nextLine();

        int number = (int) (Math.random()*6 + 1);
        System.out.println("本次摇出点数为：" + number);

        if ( (choose.equals("小") && number <= 3) || (choose.equals("大") && number >=4) ){
            //字符串之间的比较需要用equals()方法,字符串使用==进行判断可能是对地址进行比对而不是对内容进行比对。
            System.out.println("恭喜您,猜对啦!");
        }else{
            System.out.println("很可惜,猜错了。");
        }

    }
}
