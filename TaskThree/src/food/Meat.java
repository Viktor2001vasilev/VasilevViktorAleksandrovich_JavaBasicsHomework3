package food;

public abstract class Meat extends Food{
    @Override
    public void toRotten() {
        setRotten(!getRotten());
        System.out.println(getFoodName() + " протухло.");
    }
}
