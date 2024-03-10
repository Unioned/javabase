package objects;

import java.util.Objects;

public class Student {
    int age;
    String name;

    public Student(){}

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//判断是否为同一个对象
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;//向下转型比较内部属性值
        return age == student.age && Objects.equals(name, student.name);
    }
}
