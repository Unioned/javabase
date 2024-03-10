import java.util.Date;

public class test {
    public static void main(String[] args) {
//        int[] ints = new int[500];
//        ints[1] = 1;
//        ints[2] = 2;
//        ints[3] = 3;
//        ints[4] = 4;
//        System.out.println(ints[6]);

//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);
//        long timeDisSec = 10 * 60;
//        Date endTime = new Date(date.getTime() + timeDisSec * 1000);
//        System.out.println(endTime);
//        String regx = "^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";
//        String phone = "18374894528";
//        System.out.println(phone.matches(regx));
        Date date = new Date(1694768616153L);
        System.out.println(date);

        Date date1 = new Date();

        long time = date.getTime();
        long time1 = date1.getTime();
        System.out.println(time - time1);
    }
}
