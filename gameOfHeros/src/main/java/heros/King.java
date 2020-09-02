package heros;

import java.util.Random;

public class King extends AbstractHero{
    int MAX_VALUE = 15;
    int MIN_VALUE = 5;
    public King() {
        this.name = "King";
        this.power = this.generator(MAX_VALUE,MIN_VALUE);
        this.hp = this.generator(MAX_VALUE,MIN_VALUE);
    }

    public void kick(AbstractHero hero) {
        System.out.println("King kicks");
        hero.setHp(hero.getHp()-this.power);
    }
}
