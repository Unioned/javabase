package system;

import java.util.Date;

public class SystemTest {
    public static void main(String[] args) {
        //终止运行当前虚拟机
        //状态码：
        //0：当前虚拟机正常停止
        //非0：当前虚拟机异常停止
        //System.exit(0);
        //System.out.println("aaa");

        //获取当前时间毫秒值,时间原点1970年1月1日 08:00:00
        long l = System.currentTimeMillis();
        System.out.println(l);

        Date date = new Date();

        //拷贝数组
        //注意点：
        //1.数据源和目标数组长度不能小于拷贝的长度
        //2.数据源和目标数组都为基本数据类型时,数据类型需要保持一致
        //3.都是引用数据类型时,子类类型数组可以赋值给父类类型数组
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = new int[10];
        //参数一：数据源,从那个数组拷贝
        //参数二：从数据源第几个索引拷贝
        //参数三：目的地,拷贝到那个数组
        //参数四：从目的地的第几个索引开始
        //参数五：拷贝的长度
        System.arraycopy(arr1,0,arr2,1,8);
        for (int i : arr2) {
            System.out.print(i+"\t");
        }
    }
}
