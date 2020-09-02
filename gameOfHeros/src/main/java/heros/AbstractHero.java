package heros;

import java.util.Random;

public abstract class AbstractHero {
    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void kick (AbstractHero hero);

    public boolean isAlive(){
        return this.hp > 0;
    };
    public int generator (int max, int min){
        Random random = new Random();
        return random.nextInt(max-min+1) + min;
    }

}
