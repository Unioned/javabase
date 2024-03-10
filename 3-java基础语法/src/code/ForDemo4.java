package code;

public class ForDemo4 {

    public static void main(String[] args) {
        for (int i = 2 ; i <=100 ; i++){
            boolean flag = false;
            for (int j = 2 ; j <= i/2 && !flag ; j++){//返回值为true或者数超过1/2跳出循环
                flag = (i % j == 0);//如果有一个能整除返回值变为true
            }
            if (!flag){
                System.out.println(i+"是素数");
            }else{
                System.out.println(i+"不是素数");
            }
        }
    }
}
