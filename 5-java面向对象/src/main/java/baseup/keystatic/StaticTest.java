package baseup.keystatic;

public class StaticTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟";

        StaticStudent ss1 = new StaticStudent();
        System.out.println("this:"+ss1);
        ss1.age = 18;
        ss1.name = "李四";
        ss1.show1();

        System.out.println("====================");

        StaticStudent ss2 = new StaticStudent();
        System.out.println("this:"+ss2);
        ss2.age = 17;
        ss2.name = "王五";
        ss2.show1();
    }
}
