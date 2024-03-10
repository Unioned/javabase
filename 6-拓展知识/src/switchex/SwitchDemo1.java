package switchex;

/*

 */
public class SwitchDemo1 {

    public static void main(String[] args) {
        int number = 4;
        /*
        关于default:
            位置：default不一定要放在最后面，可以写在任何地方（记得加上break，不然会穿透），不会影响判断顺序。
            default可以省略，但是这样会没有判断之外的问题的处理代码了。
        */
        switch (number){
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("not exist");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
        }
    }
}
