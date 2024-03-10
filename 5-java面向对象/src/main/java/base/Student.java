package base;

public class Student {
    public String name;
    public int age;
    public String studentsNumber;

    public Student(){
        this("aaa",12,"liu");
        System.out.println("无参构造方法");
    }

    public Student(String name,int age,String studentsNumber){
        this.name = name;
        this.age = age;
        this.studentsNumber = studentsNumber;
    }
}
