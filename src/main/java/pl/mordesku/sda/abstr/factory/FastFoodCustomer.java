package pl.mordesku.sda.abstr.factory;

import pl.mordesku.sda.abstr.factory.facory.AbstractMealFactory;
import pl.mordesku.sda.abstr.factory.meals.Burger;
import pl.mordesku.sda.abstr.factory.meals.Wrap;

/**
 * Created by mordesku on 14.09.2017.
 */
public class FastFoodCustomer {
    private Burger burger;
    private Wrap wrap;

    public FastFoodCustomer(AbstractMealFactory mealFactory) {
        burger = mealFactory.createBurger();
        wrap = mealFactory.createWrap();
    }

    public Burger getBurger() {
        return burger;
    }

    public Wrap getWrap() {
        return wrap;
    }
}
