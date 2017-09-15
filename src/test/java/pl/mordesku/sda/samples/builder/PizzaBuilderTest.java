package pl.mordesku.sda.samples.builder;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class PizzaBuilderTest {
    @Test
    public void shouldCreateCapriciosa() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        pizzaBuilder.withTomatoSauce();
        pizzaBuilder.withCheese();
        pizzaBuilder.withMushroom();
        pizzaBuilder.withHam();

        Pizza pizza = pizzaBuilder.getPizza();
        assertEquals("Pizza{ingredients=[TOMATO_SAUCE, CHEESE, MUSHROOM, HAM]}", pizza.toString());
    }

}