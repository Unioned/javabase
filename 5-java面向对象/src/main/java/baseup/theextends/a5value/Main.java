package baseup.theextends.a5value;

public class Main {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}

class Zi extends Fu {
    String name = "Zi";
    public void method(){
        String name = "method";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}

class Fu {

    String name = "Fu";

}
