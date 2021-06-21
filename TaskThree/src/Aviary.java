import animals.*;

import java.util.HashMap;


public class Aviary<T extends Animal> {
    private Size aviarySize;
    private HashMap<Integer, T> animalsInAviary = new HashMap<>();


    public Aviary(Size size) {
        this.aviarySize = size;
    }

    public void putAnimalInAviary (T animal) {
        if (animal.getSize().equals(aviarySize)) {
            animalsInAviary.put(animal.getId(), animal);
            System.out.println("Животное " + animal.getName() + " добавлено в вольер.");
        }
        else {
            System.out.println("Нельзя добавить, размер вольера маловат.");
        }
    }

    public void removeAnimalFromAviary (Animal animalForParameters) {
        animalsInAviary.remove(animalForParameters.getId());
        System.out.println("Животное " + animalForParameters.getName() + " покидает вольер.");
    }

    public void getAnimalLink (int id) {
        System.out.println(animalsInAviary.get(id));
    }

    public void getNumOfMembers() {
        System.out.println("В вольере " + animalsInAviary.size() + " животных.");
    }


}
