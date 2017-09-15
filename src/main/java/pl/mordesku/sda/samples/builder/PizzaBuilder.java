package pl.mordesku.sda.samples.builder;

/**
 * Created by Mateusz Przybylski on 2017-09-15.
 */
public class PizzaBuilder {

    private Pizza pizza = new Pizza();;

    public void withTomatoSauce(){
        pizza.add(PizzaIngredient.TOMATO_SAUCE);
    }

    public void withCheese() {
        pizza.add(PizzaIngredient.CHEESE);
    }

    public void withHam() {
        pizza.add(PizzaIngredient.HAM);
    }

    public void withPineapple() {
        pizza.add(PizzaIngredient.PINEAPPLE);
    }

    public void withMushroom() {
        pizza.add(PizzaIngredient.MUSHROOM);
    }

    public void withTomato() {
        pizza.add(PizzaIngredient.TOMATO);
    }

    public void withOlive() {
        pizza.add(PizzaIngredient.OLIVE);
    }

    public Pizza getPizza() {
        return pizza;
    }
}
