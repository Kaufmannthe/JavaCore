package by.TMSTasks.lesson6_Objects.Clothes;

import by.TMSTasks.lesson6_Objects.Clothes.Jackets.Jacket;
import by.TMSTasks.lesson6_Objects.Clothes.Pants.Pants;
import by.TMSTasks.lesson6_Objects.Clothes.Shoes.Shoes;

public class Person implements IPerson {
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Person() {
    }

    public Person(Jacket jacket, Pants pants, Shoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
    jacket.putOn();
    pants.putOn();
    shoes.putOn();
    }

    @Override
    public void takeOff() {
    jacket.takeOff();
    pants.takeOff();
    shoes.takeOff();
    }

    @Override
    public int getPrice() {
        return jacket.getPrice() + pants.getPrice() + shoes.getPrice();
    }
}
