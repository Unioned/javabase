package baseup.theextends.a1animal;

public class MainClass {

    public static void main(String[] args) {
        //注意事项：子类只能访问父类中非私有的成员
        //例：此时的对象lihua无法调用Cat类中的catchMouse()方法,
        //    因为该方法修饰符从public修改为了private
        LiHua lihua = new LiHua();
        lihua.drink();
        lihua.eat();

        System.out.println("===========================");

        Teddy teddy = new Teddy();
        teddy.eat();
        teddy.drink();
        teddy.stayHome();
        teddy.touch();
    }
}
