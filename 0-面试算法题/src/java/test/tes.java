package test;

import java.util.HashMap;

public class tes {
    public static void main(String[] args) {
        HashMap<String, User> map = new HashMap<>();
        map.put("aaa", new User("zhangsan", 1));
        map.put("bbb", new User("lisi", 2));
        map.put("ccc", new User("wangwu", 3));
        map.put("ddd", new User("zhaoliu", 4));

//        1.
//        List<Map.Entry<String, User>> entries = map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue((x, y) -> Integer.compare(y.getAge(), x.getAge())))
//                .toList();
//
//        LinkedHashMap<String, User> linkedHashMap = new LinkedHashMap();
//        entries.forEach(entry -> linkedHashMap.put(entry.getKey(),entry.getValue()));
//        System.out.println(linkedHashMap);

//        2.
//        List<Map.Entry<String, User>> lis = new ArrayList<>(map.entrySet());
//        lis.sort(Map.Entry.comparingByValue((x,y) -> Integer.compare(y.getAge(),x.getAge())));
//        System.out.println(lis);
//        LinkedHashMap<String, User> linkedHashMap = new LinkedHashMap<>();
//        for (Map.Entry<String, User> li : lis) {
//            linkedHashMap.put(li.getKey(),li.getValue());
//        }
//        System.out.println(linkedHashMap);
    }
}