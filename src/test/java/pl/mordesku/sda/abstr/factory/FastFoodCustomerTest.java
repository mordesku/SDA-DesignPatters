package pl.mordesku.sda.abstr.factory;

import org.junit.Test;
import pl.mordesku.sda.abstr.factory.facory.MeatMealFactory;
import pl.mordesku.sda.abstr.factory.facory.WeganMealFactory;
import pl.mordesku.sda.abstr.factory.meals.Burrito;
import pl.mordesku.sda.abstr.factory.meals.Hamburger;
import pl.mordesku.sda.abstr.factory.meals.WeganBurger;
import pl.mordesku.sda.abstr.factory.meals.WeganBurrito;

import static org.junit.Assert.*;

/**
 * Created by mordesku on 14.09.2017.
 */
public class FastFoodCustomerTest {
    @Test
    public void testWeganMeal() throws Exception {
        FastFoodCustomer customer = new FastFoodCustomer(new WeganMealFactory());

        customer.getBurger().open();
        assertEquals(WeganBurger.CONTENT, customer.getBurger().showContent());
        customer.getWrap().unWrap();
        assertEquals(WeganBurrito.CONTENT, customer.getWrap().showContent());

    }

    @Test
    public void testJuicyMeatMeal() throws Exception {
        FastFoodCustomer customer = new FastFoodCustomer(new MeatMealFactory());

        customer.getBurger().open();
        assertEquals(Hamburger.CONTENT, customer.getBurger().showContent());
        customer.getWrap().unWrap();
        assertEquals(Burrito.CONTENT, customer.getWrap().showContent());

    }
}