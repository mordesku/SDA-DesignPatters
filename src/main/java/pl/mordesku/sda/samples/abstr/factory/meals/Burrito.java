package pl.mordesku.sda.samples.abstr.factory.meals;

/**
 * Created by mordesku on 14.09.2017.
 */
public class Burrito implements Wrap {

    public static final String CONTENT = "chicken, salsa sos, boiled corn";

    public void unWrap() {
        System.out.println("Burrito unWrapped");
    }

    public String showContent() {
        return CONTENT;
    }
}
