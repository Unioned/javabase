package code;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
//        *******
//        *** ***
//        **   **
//        *     *
        Scanner input = new Scanner(System.in);
        System.out.print("输入行数：");
        int line = input.nextInt();
        for (int i = 0 ; i < line ; i ++){
            if (i == 0){
                for (int j = 0 ; j < 2 * line - 1 ; j++){
                    System.out.print("*");
                }
            }else{
                for (int j = 0 ; j < line - i ; j++){
                    System.out.print("*");
                }
                for (int j = 0 ; j < i * 2 - 1 ; j++){
                    System.out.print(" ");
                }
                for (int j = 0 ; j < line - i ; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
