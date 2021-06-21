package animals;

public class Anaconda extends Carnivorous implements Run, Voice{

    @Override
    public void run() {
        System.out.println(getName() + " быстро ползет.");
    }

    @Override
    public String voice() {
        return getVoice();
    }

    @Override
    public String name() {
        return getName();
    }



    public Anaconda(int id, int satiety, String name, String voice) {
        setId(id);
        setSatiety(satiety);
        setVoice(voice);
        setName(name);
    }

}