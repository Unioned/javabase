package runtime;

public class RuntimeTest {
    public static void main(String[] args) {

        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime1==runtime2);

        /*Runtime.getRuntime().exit(0);
        System.out.println("执行了么？");*/

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"MB");

        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"MB");

        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"MB");

        //7.运行cmd命令
        //shutdown :关机
        //加上参数才能执行
        //-s : 默认在1分钟之后关机
        //-s -t : 指定时间:指定关机时间
        //-a : 取消关机操作
        //-r : 关机并重启
//        Runtime.getRuntime().exec(); 调用cmd命令行运行
    }
}
