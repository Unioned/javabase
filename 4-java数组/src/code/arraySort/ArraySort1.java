package code.arraySort;

//冒泡排序
public class ArraySort1 {

    public static void main(String[] args) {
        int[] array = {7,0,5,6,4,8,1,10,2,3,9};

        for (int i = 0 ; i < array.length - 1 ; i++) {
            for (int j = array.length - 1 ; j > i ; j--){
                if (array[i] < array[j]){
                    array[i] = array[i] ^ array[j];
                    array[j] = array[i] ^ array[j];
                    array[i] = array[i] ^ array[j];
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
