package baseup.polymorphism.a3disadvantage;

public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Dog();
        animal.eat();
        System.out.println("===============================");
        Dog dog = (Dog) animal;
        dog.lookHome();
        dog.eat();
        System.out.println("===============================");
        //此处会抛出异常java.lang.ClassCastException 表示类型转换异常.
//        Cat cat = (Cat) animal;
//        cat.catchMouse();
//        cat.eat();

        //标准多态向下转型转换写法
        /*if (animal instanceof Dog){
            Dog d = (Dog) animal;
        }else if (animal instanceof Cat){
            Cat c = (Cat) animal;
        }else {
            System.out.println("没有这个类型");
        }*/

        //JDK14新特性
        if (animal instanceof Dog d){
            d.eat();
        }else if (animal instanceof Cat c){
            c.eat();
        }else {
            System.out.println("没有这个类型");
        }

    }
}

class Animal{
    public void eat(){
        System.out.println("小动物吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}


