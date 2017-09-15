package pl.mordesku.sda.samples.abstr.factory;

import org.junit.Test;
import pl.mordesku.sda.samples.abstr.factory.facory.MeatMealFactory;
import pl.mordesku.sda.samples.abstr.factory.meals.WeganBurrito;
import pl.mordesku.sda.samples.abstr.factory.facory.WeganMealFactory;
import pl.mordesku.sda.samples.abstr.factory.meals.Burrito;
import pl.mordesku.sda.samples.abstr.factory.meals.Hamburger;
import pl.mordesku.sda.samples.abstr.factory.meals.WeganBurger;

import static org.junit.Assert.*;

/**
 * Created by mordesku on 14.09.2017.
 */
public class FastFoodCustomerTest {
    @Test
    public void shouldCreateWeganMeal() throws Exception {
        FastFoodCustomer customer = new FastFoodCustomer(new WeganMealFactory());

        customer.getBurger().open();
        assertEquals(WeganBurger.CONTENT, customer.getBurger().showContent());
        customer.getWrap().unWrap();
        assertEquals(WeganBurrito.CONTENT, customer.getWrap().showContent());

    }

    @Test
    public void shouldCreateJuicyMeatMeal() throws Exception {
        FastFoodCustomer customer = new FastFoodCustomer(new MeatMealFactory());

        customer.getBurger().open();
        assertEquals(Hamburger.CONTENT, customer.getBurger().showContent());
        customer.getWrap().unWrap();
        assertEquals(Burrito.CONTENT, customer.getWrap().showContent());

    }
}