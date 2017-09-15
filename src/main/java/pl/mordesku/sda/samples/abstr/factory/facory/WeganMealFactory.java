package pl.mordesku.sda.samples.abstr.factory.facory;

import pl.mordesku.sda.samples.abstr.factory.meals.Burger;
import pl.mordesku.sda.samples.abstr.factory.meals.WeganBurger;
import pl.mordesku.sda.samples.abstr.factory.meals.WeganBurrito;
import pl.mordesku.sda.samples.abstr.factory.meals.Wrap;

/**
 * Created by mordesku on 14.09.2017.
 */
public class WeganMealFactory extends AbstractMealFactory {
    @Override
    public Burger createBurger() {
        return new WeganBurger();
    }

    @Override
    public Wrap createWrap() {
        return new WeganBurrito();
    }
}
