package base;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("张三",17,"B456277194");
        System.out.println("姓名:"+student.name+"\t学号:"+student.studentsNumber+"\t年龄:"+student.age);
        Student student1 = new Student();
        System.out.println("姓名:"+student1.name+"\t学号:"+student1.studentsNumber+"\t年龄:"+student1.age);
    }
}
