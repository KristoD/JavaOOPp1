public class HumanTest {

    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        System.out.println(h1.attack(h2));
        System.out.println(h2.attack(h1));
        System.out.println(h1.displayHealth());
        System.out.println(h2.displayHealth());
    }
}