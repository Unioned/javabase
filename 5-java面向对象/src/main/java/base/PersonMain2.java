package base;

public class PersonMain2 {
    public static void main(String[] args) {
        Person person = new Person();

        //1.无参数无返回值
        person.eat();

        //2.有参数无返回值
        String myName = person.tell();
        System.out.println(myName);

        //3.无参数有返回值
        person.eatSomething("面条");

        //4.有参数有返回值
        String drinkName = person.buyDrink(5);
        System.out.println("买了一瓶"+drinkName);
    }
}
