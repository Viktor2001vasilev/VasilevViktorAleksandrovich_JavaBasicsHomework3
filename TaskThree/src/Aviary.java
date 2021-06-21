import animals.*;

import java.util.HashMap;


public class Aviary<T> {
    private int aviarySize;
    private HashMap<Integer, T> animalsInAviary = new HashMap<>();


    public Aviary(int aviarySize) {
        this.aviarySize = aviarySize;
    }

    public void putAnimalInAviary (Animal animalForParameters, T animal) {
        if (animalForParameters.getSize() > aviarySize) {
            System.out.println("Нельзя добавить, размер вольера маловат.");
        }
        else {
            animalsInAviary.put(animalForParameters.getId(), animal);
            System.out.println("Животное " + animalForParameters.getName() + " добавлено в вольер.");
            aviarySize -= animalForParameters.getSize();
        }
    }

    public void removeAnimalFromAviary (Animal animalForParameters) {
        animalsInAviary.remove(animalForParameters.getId());
        System.out.println("Животное " + animalForParameters.getName() + " покидает вольер.");
    }

    public void getAnimalLink (int id) {
        System.out.println(animalsInAviary.get(id));
    }


}
