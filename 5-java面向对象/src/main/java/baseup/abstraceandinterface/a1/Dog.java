package baseup.abstraceandinterface.a1;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);//由于父类中参数为private,所以需要调用父类中公有的构造函数来构造
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
