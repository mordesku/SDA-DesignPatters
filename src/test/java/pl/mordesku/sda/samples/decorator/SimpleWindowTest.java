package pl.mordesku.sda.samples.decorator;

import org.junit.Test;

/**
 * Created by mordesku on 14.09.2017.
 */
public class SimpleWindowTest {
    @Test
    public void shouldTestSimpleWindow()
    {
        Window window = new VerticalScrollGadgetWindowDecorator(new SimpleWindow());
        window.draw();
    }

    @Test
    public void testWindowDecorators() throws Exception {

        Window window = new HorizontalScrollGadgetWindowDecorator(new VerticalScrollGadgetWindowDecorator(new SimpleWindow()));

        window.draw();
        System.out.println(window.getTitle());
    }
}