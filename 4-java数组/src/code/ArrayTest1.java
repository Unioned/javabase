package code;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        System.out.println(a);
        //方法一,对里面的元素进行交换
        /*for (int i = 0 ; i < a.length ; i++){
            a[i] = a[i] ^ b[i];
            b[i] = a[i] ^ b[i];
            a[i] = a[i] ^ b[i];
        }*/

        //方法二:直接交换栈内存中存储的地址
        int[] temp = a;
        a = b;
        b = temp;

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i : b) {
            System.out.println(i);
        }
    }
}
