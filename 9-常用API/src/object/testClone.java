package object;

import com.google.gson.Gson;

public class testClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
            protected clone()克隆对象
        */
        int[] data = {1,2,3,4,5};
        User u1 = new User(1,"ZhangSan","12345","AiOuNiYa",data);

        //克隆对象
        //细节：   底层会帮我们创建一个对象,将数据拷贝过去
        //书写细节：
        //1.重写Object的clone方法
        //2.让重写的类继承Cloneable接口
        //3.创建原对象并进行调用
        User u2 = (User)u1.clone();

        //判定Object中的clone方法是浅克隆
        u1.data[3] = 8;

        System.out.println("浅克隆：");
        System.out.println(u1);
        System.out.println(u2);

        //深克隆需要根据自己的需求进行书写,一般重写在被调用的对象所在的类中。
        User u3 = u1.deepClone();

        u1.data[2] = 6;

        System.out.println("深克隆：");
        System.out.println(u1);
        System.out.println(u3);

        //Gson第三方工具实现深克隆
        Gson gson = new Gson();
        //对象转变为json格式
        String s = gson.toJson(u1);
        //把字符串对象变回相应对象
        User user = gson.fromJson(s, User.class);

        u1.data[1] = 7;
        System.out.println("第三方工具gson实现深克隆：");
        System.out.println(u1);
        System.out.println(user);
    }
}
