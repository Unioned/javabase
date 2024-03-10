package code;

public class ArrayForTest {

    public static void main(String[] args){
        int[] array = new int[]{10,20,30,40,50};

        System.out.print(array[0]+"\t");
        System.out.print(array[1]+"\t");
        System.out.print(array[2]+"\t");
        System.out.print(array[3]+"\t");
        System.out.println(array[4]+"\t");

        System.out.println("-----------------------------------------------");

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(array[i]);
        }

        System.out.println("-----------------------------------------------");

        for (int item : array) {
            System.out.println(item);
        }
    }
}
