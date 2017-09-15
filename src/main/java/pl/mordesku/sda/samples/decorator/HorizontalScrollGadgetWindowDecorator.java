package pl.mordesku.sda.samples.decorator;

/**
 * Created by mordesku on 14.09.2017.
 */
public class HorizontalScrollGadgetWindowDecorator extends WindowDecorator {

    public HorizontalScrollGadgetWindowDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        drawHorizontalScrollGadget();
        decoratedWindow.draw();
    }

    private void drawHorizontalScrollGadget() {
        System.out.println("Drawing horizontal scroll gadget");
    }

    public String getTitle() {
        return decoratedWindow.getTitle() + ", with horizontal scroll gadget";
    }
}
