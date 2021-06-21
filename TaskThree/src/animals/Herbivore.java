package animals;

import food.*;

public class Herbivore extends Animal{

    @Override
    public void eat(Food food) throws WrongFoodException {

            if (food instanceof Grass) {
                System.out.println(getName() + " ест " + food.getFoodName() + ".");
                setSatiety((getSatiety() + food.getSatiety()));
                System.out.println(getName() + " сыт на " + getSatiety() + " единиц.");
            }
            else {
                throw new WrongFoodException("Не та еда!");
            }



    }


}
