package animals;

public class Bear extends Carnivorous implements Run, Voice{

    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }

    @Override
    public String voice() {
        return getVoice();
    }

    @Override
    public String name() {
        return getName();
    }

    public Bear(int id, int satiety, String name, String voice) {
        setId(id);
        setSatiety(satiety);
        setVoice(voice);
        setName(name);
    }
}