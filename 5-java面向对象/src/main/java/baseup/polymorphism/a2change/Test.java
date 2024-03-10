package baseup.polymorphism.a2change;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();

        //调用成员变量:编译看左边，运行也看左边
        //编译看左边: javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，如果没有编译失败。
        //运行也看左边: java运行代码的时候，实际获取的就是左边父类中成员变量的值
        System.out.println(animal.name);

        //调用成员方法:编译看左边，运行看右边
        //编译看左边: javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，如果没有编译失败。
        //运行看右边: java运行代码的时候，实际运行子类中的方法
        animal.show();

        //理解:
        //Animal animal = new Dog();
        //现在用animal去调用变量和方法的呀? 是的
        //而a是Animal类型的，所以默认都会从Anima1这个类中去找
        //成员变量:在子类的对象中，会把父类的成员变量也继承,都有相同变量就看左边类的类型是那个类中的。
        //成员方法:如果子类对方法进行重写,在虚方法表中父类的方法会被覆盖。
    }
}
