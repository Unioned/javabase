package code;

public class TestArray1 {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1] = array[0];
        array[0] = new int[4];
        array[0][0] = 100;
        System.out.println(array[1][0]);
    }
}
