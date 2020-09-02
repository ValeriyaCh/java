package factory;

import heros.AbstractHero;

public class GameManager {
    AbstractHero player1;
    AbstractHero player2;
    public GameManager() throws Exception {
        HeroFactory h = new HeroFactory();
        this.player1 = h.createRandomHero();
        this.player2 = h.createRandomHero();
    }
    public void play(){
        System.out.println("This is a great fight between two honorable heros: "+ player1.getName()+" and " + player2.getName());
        while(this.player1.isAlive() && this.player1.isAlive()){
            this.player1.kick(this.player2);
            this.player2.kick(this.player1);
        }
        if (this.player1.isAlive()){
            System.out.println(player1.getName()+ " wins");
        }
        else{
            System.out.println(player2.getName()+ " wins");
        }
    }
}
