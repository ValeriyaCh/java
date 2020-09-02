package heros;

import java.util.Random;

public class Knight extends AbstractHero{
    int MAX_VALUE = 12;
    int MIN_VALUE = 2;
    public Knight() {
        this.name = "Knight";
        this.power = this.generator(MAX_VALUE,MIN_VALUE);
        this.hp = this.generator(MAX_VALUE,MIN_VALUE);
    }

    public void kick(AbstractHero hero) {
        System.out.println("Knight kicks");
        hero.setHp(hero.getHp()-this.power);
    }
}
