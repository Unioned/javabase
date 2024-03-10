package baseup.theextends.a2value;

public class Zi extends Fu{
    public String gender;

    @Override
    public String toString() {
        int age = this.getAge();
        return "Zi{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
