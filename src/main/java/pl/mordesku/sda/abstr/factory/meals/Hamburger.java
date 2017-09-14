package pl.mordesku.sda.abstr.factory.meals;

/**
 * Created by mordesku on 14.09.2017.
 */
public class Hamburger implements Burger {

    public static final String CONTENT = "beef, ketchup";

    public String showContent() {
        return CONTENT;
    }

    public void open() {
        System.out.println("Hamburger opened");
    }
}
