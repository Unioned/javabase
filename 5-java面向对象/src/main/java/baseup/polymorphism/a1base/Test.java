package baseup.polymorphism.a1base;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("张三");

        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("阿伟");

        Administrator administrator = new Administrator();
        administrator.setAge(40);
        administrator.setName("王管理");

        register(student);
        register(teacher);
        register(administrator);
    }

    public static void register(Person p){
        p.show();
    }
}
