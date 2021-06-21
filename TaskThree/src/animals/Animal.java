package animals;

import food.*;

import java.util.Objects;

public abstract class Animal<E> {
    private int id;
    private String name;
    private int satiety;
    private String voice;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public String getVoice(){
        return voice;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSatiety() {
        return satiety;
    }


    public void eat(Food food) throws WrongFoodException {}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
