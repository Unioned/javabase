package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {

    public static void main(String[] args) throws ParseException {
        String s = "2023-10-11";
//        String a = new SimpleDateFormat("yyyy年MM月dd日").format(s);
//        System.out.println(a);
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
        SimpleDateFormat sdf1 = new SimpleDateFormat( "yyyy年MM月dd日");
        Date parse = sdf.parse(s);
        System.out.println(parse);
        System.out.println(sdf1.format(parse));
    }
}
