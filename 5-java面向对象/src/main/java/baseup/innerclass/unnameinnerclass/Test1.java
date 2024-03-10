package baseup.innerclass.unnameinnerclass;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });

        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        method(animal);

        new Animal(){
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        }.eat();
    }

    public static void method(Animal animal){
        animal.eat();
    }
}
