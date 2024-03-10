package code;

public class TestArray {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4,5,6},{7,8,9}};

//        一般for循环遍历二维数组
        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array[i].length ; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

//        加强for循环进行遍历
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }


    }
}
