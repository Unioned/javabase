package string;

public class StringReplace {

    public static void main(String[] args) {
        String talk = "你会不会玩啊,XSL,TMD,TM";
        String[] illegal = {"TMD","XSL"};
        for (String s : illegal) {
            talk = talk.replace(s, "***");
        }
        System.out.println(talk);
        talk.intern();
    }
}
