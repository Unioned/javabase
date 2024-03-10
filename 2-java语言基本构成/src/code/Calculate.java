package code;

public class Calculate {

    public static void main(String[] args) {

        int a=1;
        for(int i = 1 ; i < 100 ; i++){
            a = a++;
        }
        System.out.println(a);

        System.out.println("--------------------------------------");

        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

    }
}
