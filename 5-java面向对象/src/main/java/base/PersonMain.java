package base;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        //通过对象调用属性进行值的存取
        //属性有默认值    name = null   age = 0   sex = null
        person.name = "张三";
        person.age = 18;
        person.sex = "男";

        //新建一个对象和之前person无关系
        Person person1 = new Person();
//        person1存了person的地址,进行属性改变,两个对象的值会一起改变。
//        Person person1 = person;
        person1.name = "小红";
        person1.age = 18;
        person1.sex = "女";

        //new的对象中存储的为地址
        System.out.println(person);
        System.out.println(person1);

        //通过对象进行取值
        System.out.println(person.name+"是个"+person.sex+"生,今年"+person.age+"岁");
        System.out.println(person1.name+"是个"+person1.sex+"生,今年"+person1.age+"岁");
    }
}
