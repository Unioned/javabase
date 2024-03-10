package string;

import java.util.StringJoiner;

public class JoinerString {

    public static void main(String[] args) {
        //add() 添加数据,并返回对象本身
        StringJoiner sj = new StringJoiner(", ","[","]");

        sj.add("aaa").add("bbb").add("ccc");
        int length = sj.length();

        System.out.println(length);
        System.out.println(sj);
    }

}
