package pl.mordesku.sda.excercise.abstr.factory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-15
 * Time: 20:04
 */
public class HawaFantaOrderFactory extends AbstractOrderFactory {
    @Override
    public Pizza getPizza() {
        return new Hawai();
    }

    @Override
    public Drink getDrink() {
        return new Fanta();
    }
}
