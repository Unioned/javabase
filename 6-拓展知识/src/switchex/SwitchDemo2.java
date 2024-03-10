package switchex;

public class SwitchDemo2 {

    public static void main(String[] args) {
        int number = 1;
        OneSwitch(number);
    }

    public static void OneSwitch(int number){
        //JDK12新增特性 没有穿透现象
        switch (number){
            case 1 -> {
                System.out.println("one");
            }
            case 2 -> {
                System.out.println("two");
            }
            case 3 -> {
                System.out.println("three");
            }
            default -> {
                System.out.println("not exist");
            }
        }
    }
}
