package baseup.innerclass.quickstart;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine{
        String engineName;
        int engineAge;

        public void show(){
            System.out.println(carName);
            System.out.println(engineName);
        }
    }


}

class Test{
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "宝马";
        c.carAge = 2;
        c.carColor = "蓝色";

        Car.Engine e = c.new Engine();//其他类访问内部类的方法
        e.engineName = "aaa";

        c.show();
        e.show();
    }
}
