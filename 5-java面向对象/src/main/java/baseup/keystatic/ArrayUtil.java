package baseup.keystatic;

public class ArrayUtil {

    //私有化构造方法
    //目的：为了不让外界创建其对象
    private ArrayUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }

    public static double getAve(double[] arr){
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }
}
