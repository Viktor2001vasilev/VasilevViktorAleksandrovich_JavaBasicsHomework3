package animals;

import Enum.Size;

public class Duck <Grass> extends Herbivore implements Fly, Run, Swim, Voice{

    @Override
    public void fly() {
        System.out.println(getName() + " летит.");
    }
    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
    @Override
    public void swim() {
        System.out.println(getName() + " плавает.");
    }
    @Override
    public String voice() {
        return getVoice();
    }
    @Override
    public String name() {
        return getName();
    }

    public Duck(int id, int satiety, String name, String voice) {
        setId(id);
        setSatiety(satiety);
        setVoice(voice);
        setName(name);
        setSize(Size.MEDIUM);
    }
}
