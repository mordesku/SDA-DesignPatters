package pl.mordesku.sda.decorator;

/**
 * Created by mordesku on 14.09.2017.
 */
public class VerticalScrollGadgetWindowDecorator extends WindowDecorator {

    public VerticalScrollGadgetWindowDecorator(Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        drawVerticalScrollGadget();
        decoratedWindow.draw();
    }

    private void drawVerticalScrollGadget() {
        System.out.println("Drawing vertical scroll gadget");
    }

    public String getTitle() {
        return decoratedWindow.getTitle() + ", with vertical scroll gadget";
    }
}
