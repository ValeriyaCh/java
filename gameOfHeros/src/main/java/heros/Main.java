package heros;

import factory.GameManager;
import factory.HeroFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        GameManager newGame = new GameManager();
        newGame.play();
    }
}
