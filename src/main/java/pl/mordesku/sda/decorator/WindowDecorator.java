package pl.mordesku.sda.decorator;

/**
 * Created by mordesku on 14.09.2017.
 */
public abstract class WindowDecorator implements Window {
    protected Window decoratedWindow;

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }
}
