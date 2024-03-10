package baseup.keystatic;

public class StudentMain {
    public static void main(String[] args) {
        Student.teacherName = "阿伟";
        Student s1 = new Student();
        s1.setAge(18);
        s1.setGender("男");
        s1.setName("王五");

        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setAge(28);
        s2.setGender("女");
        s2.setName("小芳");

        s2.study();
        s2.show();

    }
}
