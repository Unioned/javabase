package code;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] oldArray = {1,2,3,0,0,4,5,0,6,0,7};

        //得到0的数量
        int count = 0;
        for (int i : oldArray) {
            if (i == 0){
                count++;
            }
        }
        System.out.println(count);

        //建立新数组存入数据
        int[] newArray = new int[oldArray.length - count];
        int newIndex = 0;
        for (int i : oldArray) {
            if (i != 0){
                newArray[newIndex] = i;
                newIndex++;
            }
        }

        //验证输出
        for (int i : newArray) {
            System.out.print(i+"\t");
        }

        //让变量指向空，清除对数组的应用
        //在堆内存中数据没有任何引用指向会被垃圾回收器回收删除
        oldArray = null;
    }
}
