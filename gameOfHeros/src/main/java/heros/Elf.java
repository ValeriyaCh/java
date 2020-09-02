package heros;

public class Elf extends AbstractHero {

    public Elf() {
        this.name = "Elf";
        this.power = 10;
        this.hp = 10;
    }

    public void kick(AbstractHero hero) {
        System.out.println("Elf kicks");
        if (hero.getPower() < this.power){
            hero.setHp(0);
        }
        else {
            hero.setPower(hero.getPower()-1);
        }
    }

}
