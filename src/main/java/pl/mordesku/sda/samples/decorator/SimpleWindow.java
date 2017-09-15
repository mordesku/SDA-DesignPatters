package pl.mordesku.sda.samples.decorator;

/**
 * Created by mordesku on 14.09.2017.
 */
public class SimpleWindow implements Window {

    public void draw() {
        System.out.println("Drawing simple window");
    }

    public String getTitle() {
        return "Simple Window";
    }
}
