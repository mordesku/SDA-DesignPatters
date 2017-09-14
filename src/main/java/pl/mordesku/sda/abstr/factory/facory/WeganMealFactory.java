package pl.mordesku.sda.abstr.factory.facory;

import pl.mordesku.sda.abstr.factory.meals.*;

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
