package baseup.innerclass.personinnerclass;

public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(new Outer().a);
            System.out.println(Outer.this.a);
        }
    }
}

class Test{
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        i.show();
    }
}