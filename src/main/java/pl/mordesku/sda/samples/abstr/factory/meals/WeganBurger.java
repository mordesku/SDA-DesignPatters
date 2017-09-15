package pl.mordesku.sda.samples.abstr.factory.meals;

/**
 * Created by mordesku on 14.09.2017.
 */
public class WeganBurger implements Burger {

    public static final String CONTENT = "no beef :(, cheese, ketchup";

    public String showContent() {
        return CONTENT;
    }

    public void open() {
        System.out.println("WeganBurger opened");
    }
}
