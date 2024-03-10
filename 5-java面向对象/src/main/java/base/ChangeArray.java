package base;

public class ChangeArray {

    public int[][] changeTwoArray(int[] x, int[] y){
        int[] temp = x;
        x = y;
        y = temp;
        return new int[][]{x,y};
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        int[] y = {5,6,7,8,9};

        ChangeArray changeArray = new ChangeArray();
        int[][] ints = changeArray.changeTwoArray(x, y);
        x = ints[0];
        y = ints[1];

        for (int i : x) {
            System.out.println(i);
        }

        System.out.println("===============================");

        for (int i:y){
            System.out.println(i);
        }
    }
}
