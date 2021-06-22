package animals;

import food.*;

public abstract class Carnivorous extends Animal{
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(getName() + " ест " + food.getFoodName() + ".");
            setSatiety((getSatiety()+food.getSatiety()));
            System.out.println(getName() + " сыт на " + getSatiety() + " единиц.");
        }
        else {
            throw new WrongFoodException("Не та еда!");
        }
    }
}