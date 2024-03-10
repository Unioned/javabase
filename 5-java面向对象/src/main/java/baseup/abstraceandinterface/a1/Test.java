package baseup.abstraceandinterface.a1;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙",1);
        frog.eat();
        frog.swim();

        Rabbit rabbit = new Rabbit("兔子",2);
        rabbit.eat();
    }
}
