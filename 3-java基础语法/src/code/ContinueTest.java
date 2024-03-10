package code;

public class ContinueTest {
    public static void main(String[] args) {

        for (int k = 1 ; k <= 4 ; k++){
            if (k == 3){
                continue;
            }
            System.out.println("hello world");
        }

        System.out.println("===================================================");

        int i = 1;
        int j = 1;
        for (;i <= 4 ; i++){
            for (;j <= 4 ;j++){
                if (j == 3){
                    continue;
                }
                System.out.println("hello world");
            }
        }
        System.out.println(i);
        System.out.println(j);

    }
}
