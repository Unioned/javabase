package baseup.abstraceandinterface.a2;

public interface InterA {
    void method();

    default void show(){
        System.out.println("默认接口方法a");
    }
}
