package pl.mordesku.sda.abstr.factory.meals;

/**
 * Created by mordesku on 14.09.2017.
 */
public class WeganBurrito implements Wrap {

    public static final String CONTENT = "no chicken :(, salsa sos, boiled corn";

    public void unWrap() {
        System.out.println("WeganBurrito unWrapped");
    }

    public String showContent() {
        return CONTENT;
    }
}
