package base;

public class ArgsReLoad {

    public void test(int... x){
        System.out.println("动态参数列表");
        System.out.println(x.length);
        for (int i : x) {
            System.out.println(i);
        }
    }

    public void method(){
        System.out.println("方法没有任何参数");
    }

    public void method(int arg){
        System.out.println("方法携带一个int参数,值为:"+arg);
    }

    public void method(boolean arg){
        System.out.println("方法携带一个boolean参数,值为:"+arg);
    }

    public void method(double arg){
        System.out.println("方法携带一个double参数,值为:"+arg);
    }

    public static void main(String[] args) {
        ArgsReLoad argsReLoad = new ArgsReLoad();
        argsReLoad.method(2);
        argsReLoad.test(1);
        argsReLoad.test(1,2);
        argsReLoad.test(1,2,3);
        argsReLoad.test(1,2,3,4,5,6,7,8);
    }
}
