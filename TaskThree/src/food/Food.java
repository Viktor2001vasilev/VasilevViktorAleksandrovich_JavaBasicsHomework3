package food;

public abstract class Food {
    private String foodName;
    private int satiety;
    private boolean rotten;

    abstract void toRotten();

    public void setRotten(boolean rotten){
        this.rotten = rotten;
    }
    public boolean getRotten() {
        return rotten;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public int getSatiety(){
        return satiety;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodName() {
        return foodName;
    }
}
