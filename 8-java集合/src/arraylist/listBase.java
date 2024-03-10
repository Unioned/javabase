package arraylist;

import java.util.ArrayList;

//集合存储的是引用数据类型,基本数据类型必须用对应包装类才能存储
public class listBase {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        //向集合添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (String str : list) {
            System.out.print(str+" ");
        }

        System.out.println();

        System.out.println("==========================");

        list.remove("aaa");//根据索引删除
        list.remove(1);//根据元素删除

        for (String str : list) {
            System.out.print(str+" ");
        }

        System.out.println();

        System.out.println("==========================");

        list.set(1,"bbb");//根据索引修改数据

        for (String str : list) {
            System.out.print(str+" ");
        }

        System.out.println();

        System.out.println("==========================");

        String s = list.get(1);//根据索引得到数据

        for (String str : list) {
            System.out.print(str+" ");
        }

        System.out.println();
        System.out.print(s);
    }
}
