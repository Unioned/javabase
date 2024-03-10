package code;

public class ArrayTest4 {
    public static void main(String[] args) {
        int primeRange = 100;

        int[] primeArray = new int[primeRange/2];
        int primeIndex = 0;//索引用于记录位置,同时可以记录到素数数量

        //查素数
        for (int num = 2 ; num <= primeRange ; num++){
            boolean b = false;
            for (int i = 2 ; i <= num/2 ; i++){
                if (num % i == 0){
                    b = true;
                    break;
                }
            }
            if (!b){
                primeArray[primeIndex++] = num;
            }
        }

        //通过记录的索引创建一个内存刚好的数组进行数据存储
        int[] primeArray2 = new int[primeIndex];
        //进行数组元素复制
        System.arraycopy(primeArray, 0, primeArray2, 0, primeArray2.length);
        for (int i : primeArray2) {
            System.out.println(i);
        }
        primeArray = null;
    }
}
