package code;

public class ArrayInitTest {

    public static void main(String[] args) {
        int[] i = new int[5];
        for (int i1 : i) {
            System.out.println(i1);
        }
        double[] d = new double[5];
        for (double v : d) {
            System.out.println(v);
        }
        String[] s = new String[5];
        for (String s1 : s) {
            System.out.println(s1);
        }
        boolean[] b = new boolean[5];
        for (boolean b1 : b) {
            System.out.println(b1);
        }
    }
}
