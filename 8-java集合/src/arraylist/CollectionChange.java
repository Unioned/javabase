package arraylist;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionChange {

    public static void main(String[] args) {
        listToMap();
    }

    /**
     * 数组 --> List
     */
    public static void arrToList(){
        // 基本数据类型的数组转换成集合,会将整个数组当作一个对象转换
        // 输出：[[I@地址]
        int[] arr = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(arr);
        System.out.println(list);

        // 将数组转换成集合,数组必须是引用数据类型
        // 輸出：[1, 2, 3, 4, 5]
        Integer[] arr2 = {1, 2, 3, 4, 5};
        // Arrays.asList()返回一个受指定数组支持的固定大小的列表。所以不能做Add、Remove等操作。
        List<Integer> list2 = Arrays.asList(arr2);
        // 再次新建List就可以了
        List<Integer> list3 = new ArrayList<>(list2);
        list3.add(7);
        System.out.println(list2);
        System.out.println(list3);
    }

    /**
     * List --> 数组
     * 数组必须是引用数据类型
     */
    public static void listToArr(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add("String number: "+i);
        }
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * List --> Set
     * 将 List 集合转为 Set 集合，是可以直接去重的。
      */
    private static void listToSet(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add("String number: "+i);
        }
        list.add("String number: "+3);
        // 直接new一个对象，将list放入即可
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    /**
     * Set --> List
     * Set 集合转 List 集合类似，直接 new 一个 List 对象，将 set 集合放入即可
      */
    private static void setToList(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            set.add("String number: "+i);
        }
        //方式1
        List<String> list = new ArrayList<>(set);
        System.out.println(list);
        //方式2
        List<String> streamList = set.stream().toList();
        System.out.println(streamList);
    }

    /**
     * List --> Map
     * 如果我们的 List 存放的对象，我们想要将其转化为 Map 集合，key为对象的某个属性。(使用Stream流实现)，自动通过key去重，取最后一个重复的。
     */
    private static void listToMap(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new User(i,"张三"+i));
        }
        list.add(new User(3,"张三"+4));
        System.out.println(list);
        Map<Integer, User> collect = list.stream().
                collect(Collectors.toMap(User::getAge, Function.identity(), (key1, key2) -> key2));
        System.out.println(collect);
    }

    /**
     * Map --> List/Set
     */
    private static void mapToListOrSet(){
        Map<Integer, User> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(i,new User(i,"张三-"+i));
        }
        System.out.println(map);
        // 直接获取map的key的set集合
        Set<Integer> set1 = map.keySet();
        System.out.println(set1);
        // 将map的values 转换为Set集合
        Set<User> set = new HashSet<>(map.values());
        System.out.println(set);
        // 将map的key 转换为List集合
        List<Integer> integers = map.keySet().stream().toList();
        System.out.println(integers);
        // 将map的values 转换为List集合
        List<User> list = new ArrayList<>(map.values());
        System.out.println(list);
    }

    /**
     * List --> List/Set
     * List1 集合存放是对象，我们希望直接从集合里获取到 对象的某个属性的 List2  集合 (使用Stream流实现)
     */
    private static void listToList(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new User(i,"zhang"+i));
        }

        list.stream().map(user -> user.getName()).toList();
        // 获取到 name的list集合
        List<String> list1 = list.stream().map(User::getName).toList();
        // 获取到 name的set集合
        Set<String> set = list.stream().map(User::getName).collect(Collectors.toSet());
        System.out.println(list1);
        System.out.println(set);
    }

}
