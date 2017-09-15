package pl.mordesku.sda.samples.abstr.factory.facory;

import pl.mordesku.sda.samples.abstr.factory.meals.Burger;
import pl.mordesku.sda.samples.abstr.factory.meals.Wrap;

/**
 * Created by mordesku on 14.09.2017.
 */
public abstract class AbstractMealFactory {
    public abstract Burger createBurger();
    public abstract Wrap createWrap();
}
