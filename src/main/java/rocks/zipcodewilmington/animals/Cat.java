package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal implements Animal {
    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }


    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
