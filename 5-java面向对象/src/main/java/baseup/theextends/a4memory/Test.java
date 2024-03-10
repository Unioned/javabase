package baseup.theextends.a4memory;

import org.openjdk.jol.vm.VM;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Zi zi = new Zi();

        System.out.println(Long.toHexString(VM.current().addressOf(zi)));

        while (true){}
    }
}

class Fu{
    private int a = 0x111;
    int b = 0x222;

    public void fuShow1(){
        System.out.println("public---fuShow");
    }

    private void fuShow2(){
        System.out.println("private---fuShow");
    }
}

class Zi{
    int c = 0x333;

    public void ziShow(){
        System.out.println("public---ziShow");
    }
}
