package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
//        s3();
        List<Integer> list = new Vector();

    }

//    Collection下的 stream() 和 parallelStream() 方法
    public static void s1(){
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();  //串行流
        Stream<String> parallelStream = list.parallelStream(); //并行流
    }

//    Arrays 中的 stream() 方法，将数组转成流
    public static void s2(){
        Integer[] nums = new Integer[10];
        Stream<Integer> stream = Arrays.stream(nums);
    }

//    Stream中的静态方法：of()、iterate()、generate()
    public static void s3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
        stream.forEach(System.out::println);
        // 输出：1 2 3 4 5 6
        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 2).limit(6);
        stream2.forEach(System.out::println);
        // 输出：0 2 4 6 8 10
        Stream<Double> stream3 = Stream.generate(Math::random).limit(2);
        stream3.forEach(System.out::println);
        // 输出：两个随机数
    }
}
