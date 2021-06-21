package animals;

public class Fish extends Herbivore implements Swim {

    @Override
    public void swim() {
        System.out.println(getName() + " плавает.");
    }


    public Fish(int id, int satiety, String name, String voice) {
        setId(id);
        setSatiety(satiety);
        setVoice(voice);
        setName(name);
    }
}
