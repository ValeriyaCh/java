package heros;

public class Hobbit extends AbstractHero {

    public Hobbit() {
        this.name = "hobbit";
        this.power = 0;
        this.hp = 3;
    }

    public void kick(AbstractHero hero) {
        System.out.println("Hobbit kicks:");
        toCry();
    }

    private void toCry() {
        System.out.println("aaaaa");
    }

}
