package base;

public class Person {
    public String name;
    public int age;
    public String sex;

    public void eat(){
        System.out.println("吃了一碗饭");
    }

    public String tell(){
        String name = "ada";
        System.out.print("名字:");
        return  name;
    }

    public void eatSomething(String something){
        System.out.println("吃了"+something);
    }

    public  String buyDrink(int money){
        if (money <= 1 ){
            return "啥也买不了";
        }else if (money <= 5){
            return "可乐";
        }else {
            return "红牛";
        }
    }
}
