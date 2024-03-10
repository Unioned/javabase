package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Demo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        List<String> strings = removeB(list);

        System.out.println(strings);
    }

    private static List<String> removeB(List<String> list) {
        TreeSet<String> strings = new TreeSet<>(list);
        return new ArrayList<>(strings);
    }
}