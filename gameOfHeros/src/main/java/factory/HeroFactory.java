package factory;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import heros.AbstractHero;

public class HeroFactory {
    protected List<String> herosNames = Arrays.asList("heros.Hobbit", "heros.Elf", "heros.King", "heros.Knight");

    public void addHero(String fullClassName) {
        this.herosNames.add(fullClassName);
    }

    public AbstractHero createRandomHero() throws Exception {
        Random random = new Random();
        int randIndex = random.nextInt(herosNames.size());
        String randHero = (herosNames.get(randIndex));
        return (AbstractHero) Class.forName(randHero).getConstructor().newInstance();
    }

}
