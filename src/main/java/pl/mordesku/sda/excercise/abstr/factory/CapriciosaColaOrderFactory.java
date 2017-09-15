package pl.mordesku.sda.excercise.abstr.factory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-15
 * Time: 18:32
 */
public class CapriciosaColaOrderFactory extends AbstractOrderFactory{

    @Override
    public Pizza getPizza() {
        return new Capriciosa();
    }

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}
