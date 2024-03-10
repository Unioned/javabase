import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(4);
        System.out.println(delList(list));

        int[] array = new int[]{8,5,9,4,3,2,6,0,7,1};
        System.out.println(Arrays.toString(arraySort(array)));
    }


    /*9、有一个存放数值的List，请写代码删除所有其中大于平均值的元素。*/
    public static List<Integer> delList(List<Integer> list){
        double avg = 0;
        for (Integer item : list) {
            avg += item;
        }
        avg = avg/list.size();
        System.out.println("平均值为:"+avg);
        for (int i = 0; i < list.size();) {
            if (list.get(i) > avg){
                list.remove(i);
            } else {
                i++;
            }
        }
        return list;
    }

    /*
    10、制作一个对数值数组进行排序的程序，并对如下数组8，5，9，4，3，2，6，0，7，1做出排序运算的模拟。
    答题要求：1.用java语言；2.画出算法流程图。 (插入排序)*/
    public static int[] arraySort(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j -1] < array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
