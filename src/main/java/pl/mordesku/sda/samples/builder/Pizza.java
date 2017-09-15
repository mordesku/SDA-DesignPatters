package pl.mordesku.sda.samples.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class Pizza {
    List<PizzaIngredient> ingredients = new ArrayList<PizzaIngredient>();

    public boolean add(PizzaIngredient pizzaIngredient) {
        return ingredients.add(pizzaIngredient);
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredients=" + ingredients + '}';
    }
}
