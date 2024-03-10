package baseup.polymorphism.a2change;

public class Dog extends Animal{
    String name = "狗";

    @Override
    public void show(){
        System.out.println("Dog");
    }
}
