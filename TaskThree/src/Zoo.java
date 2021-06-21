import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Duck<Grass> duck = new Duck(1,10,"Duck", "кря", 3);
        Duck duck2 = new Duck(2,10,"Duck2", "кря", 3);
        Cow cow = new Cow(3,20,"Cow", "муууу", 8);
        Fish fish = new Fish(4, 2,"Fish", null);
        Fish fish2 = new Fish(5,2,"Fish2", null);
        Lion lion = new Lion(6, 30, "Lion", "PPPPPPP", 10);
        Bear bear = new Bear(7, 40, "Bear", "Pppppp");
        Anaconda anaconda = new Anaconda(8, 10, "Anaconda", "Шшшшшш");


        Worker worker = new Worker();

        Banana banana = new Banana("Banana", 5);
        Meat stake = new Stake("Stake", 10);
        FishFood fishFood = new FishFood("FishFood", 1);

        worker.feed(duck, banana);

        System.out.println("Всего в нашем зоопарке 4 типа вольеров: ");
        for (AviaryTypes types : AviaryTypes.values()) System.out.println(types);


        Aviary<Herbivore> aviary1 = new Aviary<>(8); // для 1 коровы
        Aviary<Carnivorous> aviary2 = new Aviary<>(10); // для 1 льва

        aviary1.putAnimalInAviary(cow, cow);
        aviary2.putAnimalInAviary(lion, lion);
        aviary1.putAnimalInAviary(duck, duck);
        aviary1.getAnimalLink(cow.getId());


    }

    public enum AviaryTypes {
        HUGEAviary,
        LARGEAviary,
        MEDIUMAviary,
        SMALLAviary
    }


}
