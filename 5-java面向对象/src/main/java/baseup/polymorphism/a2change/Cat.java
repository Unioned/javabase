package baseup.polymorphism.a2change;

public class Cat extends Animal{
    String name = "猫";

    @Override
    public void show(){
        System.out.println("Cat");
    }
}
