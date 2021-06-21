package food;

public abstract class Grass extends Food{
    @Override
    public void toRotten() {
        setRotten(!getRotten());
        System.out.println(getFoodName() + " протухло.");
    }

}
