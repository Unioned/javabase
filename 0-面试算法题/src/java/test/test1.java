package test;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class test1 {
    public static void main(String[] args) {
        int ids = 1000;
        int id133 = 0;
        List<Pa50> pa50s = new LinkedList<>();
        List<Pa50> pa50st = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ids++;
            id133++;
            Pa50 pa50 = new Pa50(ids + "",id133 + "");
            pa50s.add(pa50);
            pa50st.add(pa50);
        }


        while (!pa50s.isEmpty()){
            if (Objects.equals(pa50s.get(0).getPa133(), "2")){
                ids++;
                id133++;
                pa50s.add(new Pa50(ids + "",id133 + ""));
            }
            Pa50 remove = pa50s.remove(0);
        }
        pa50st.addAll(pa50s);
        while (!pa50st.isEmpty()){
            System.out.println(pa50st.remove(0));
        }
    }
}
