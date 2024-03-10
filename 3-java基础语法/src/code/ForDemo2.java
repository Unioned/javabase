package code;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入数字金字塔最大值:");
        int maxNumber = input.nextInt();
        for (int i = 1 ; i <= maxNumber ; i++){
            for (int j = 1 ; j <= maxNumber - i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for (int j = i - 1 ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
