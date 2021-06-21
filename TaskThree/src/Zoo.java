import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck(1,10,"Duck", "кря");
        Duck duck2 = new Duck(2,10,"Duck2", "кря");
        Cow cow = new Cow(3,20,"Cow", "муууу");
        Fish fish = new Fish(4, 2,"Fish", null);
        Fish fish2 = new Fish(5,2,"Fish2", null);
        Lion lion = new Lion(6, 30, "Lion", "PPPPPPP");
        Bear bear = new Bear(7, 40, "Bear", "Pppppp");
        Anaconda anaconda = new Anaconda(8, 10, "Anaconda", "Шшшшшш");
        Duck duck3 = new Duck(9,10,"Duck3","кря");


        Worker worker = new Worker();

        Banana banana = new Banana("Banana", 5);
        Meat stake = new Stake("Stake", 10);
        FishFood fishFood = new FishFood("FishFood", 1);



        Aviary<Carnivorous> aviary1 = new Aviary<>(Size.HUGE); // Большой вольер для больших животных
        Aviary<Herbivore> aviary2 = new Aviary<>(Size.MEDIUM); // Средний вольер для средних животных
        Aviary<Herbivore> aviary3 = new Aviary<>(Size.SMALL); // Маленький вольер для самых маленьких

        aviary1.putAnimalInAviary(lion);
        aviary1.putAnimalInAviary(bear);
        aviary1.getAnimalLink(bear.getId());
        aviary1.getNumOfMembers();

        aviary2.putAnimalInAviary(duck);
        aviary2.putAnimalInAviary(duck2);
        aviary2.putAnimalInAviary(duck3);
        aviary2.getNumOfMembers();

        aviary3.putAnimalInAviary(fish);
        aviary3.putAnimalInAviary(fish2);
        aviary3.getNumOfMembers();

        worker.feed(duck, banana);
        worker.feed(lion, stake);
        worker.feed(lion, banana);

    }


}
