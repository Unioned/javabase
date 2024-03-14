package string;

//字符串底层原理
public class StringBuilder {
    public static void main(String[] args) {
        //StringBuilder底层扩容机制:
        //1.首先容量默认为16,长度为0
        //2.随着插入的字符串长度增多,长度超过容量之后则会通过 容量=容量*2+2 进行扩容(通过要点3的扩容之后仍然有这个规则)。
        //3.如果一次扩容不够的话,那么容量就会扩容到和长度一样
        //4.底层通过byte数组进行存储,扩容通过new一个新的byte数组进行数组复制并改变地址引用
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("=====================================");
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
        sb1.append("abc");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println("=====================================");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("=====================================");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        sb3.append("a");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }
}
