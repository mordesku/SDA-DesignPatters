package pl.mordesku.sda.samples.abstr.factory.facory;

import pl.mordesku.sda.samples.abstr.factory.meals.Burger;
import pl.mordesku.sda.samples.abstr.factory.meals.Burrito;
import pl.mordesku.sda.samples.abstr.factory.meals.Hamburger;
import pl.mordesku.sda.samples.abstr.factory.meals.Wrap;

/**
 * Created by mordesku on 14.09.2017.
 */
public class MeatMealFactory extends AbstractMealFactory {
    @Override
    public Burger createBurger() {
        return new Hamburger();
    }

    @Override
    public Wrap createWrap() {
        return new Burrito();
    }
}
