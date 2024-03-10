package arrayex;

public class ArrayDemo2 {

    public static void main(String[] args) {
        char[] d = new char[1];

        System.out.println(d[0]);
        //Java的char数组的默认值，出现方框原因,空白符的code是0x20，0x20以下为不可见的控制字符。
        //某些系统在遇到不可见字符时会输出一个方框表示遇到了不可见字符。
    }
}
