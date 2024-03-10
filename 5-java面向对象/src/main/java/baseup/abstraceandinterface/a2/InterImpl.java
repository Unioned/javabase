package baseup.abstraceandinterface.a2;

public class InterImpl implements InterA,InterB{
    @Override
    public void method() {
        System.out.println("method");
    }

    //由于两个默认方法重名,因此此处需要强制进行重写
    @Override
    public void show() {
        InterA.super.show();
        /*原文摘自https://www.cnblogs.com/JSD1207ZX/p/15178154.html
        super和this在子接口中的使用
        由于接口不是类，super和this的使用和类将会产生较大的区别。
        首先我们无法在子接口中使用super，只能使用this。（接口名.super和接口名.this仍旧等价于super和this）
        而对于父接口，我们无法通过super来调用的情况下，我们必须通过父接口名.super的方式来调用某个父接口。
        也就是说父接口名.super指向的不是父接口的父接口，而是其本身。
        这是因为一个接口可以继承多个接口，我们无法直接使用super来指代某一个父接口，
        所以编译器阻止了super这样的用法，即便只继承了一个父接口，改而使用父接口名.super这样显式的指出哪一个父接口。*/
        /*自己理解:
        同理，一个类可以实现多个接口，我们无法直接使用super来指代某一个父接口，
        所以编译器阻止了super这样的用法，即便只继承了一个父接口，改而使用父接口名.super这样显式的指出哪一个父接口。
        */
    }
}
