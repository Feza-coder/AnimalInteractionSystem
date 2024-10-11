//Create instances of both Dog and Cat, interact with them by feeding and playing with them.
//Display their interaction histories using showInteractionHistory.
public class AnimalTest {
    public static void main (String[] args){
        Dog chiwawa = new Dog();
        Cat Ignola = new Cat();

        chiwawa.feed("Bones");
        chiwawa.bark();
        chiwawa.sleep(4);
        chiwawa.play();

        Ignola.feed("Milk");
        Ignola.sleep(7);
        Ignola.meow();
        Ignola.play();

        System.out.println("The chiwawa Interaction History: ");
        chiwawa.showInteractionHistory();

        System.out.println("Ignola interaction History");
        Ignola.showInteractionHistory();
    }
}
