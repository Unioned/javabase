package baseup.theextends.a6method;

public class MainTest {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.breakHome();
        husky.drink();
        husky.eat();
        husky.stayHome();

        System.out.println("=======================");

        SharPei sharPei = new SharPei();
        sharPei.drink();
        sharPei.eat();
        sharPei.stayHome();

        System.out.println("=======================");

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.drink();
        chineseDog.eat();
        chineseDog.stayHome();
    }
}
