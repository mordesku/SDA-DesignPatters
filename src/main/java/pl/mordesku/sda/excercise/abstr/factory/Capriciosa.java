package pl.mordesku.sda.excercise.abstr.factory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-15
 * Time: 18:21
 */
public class Capriciosa extends Pizza {

    public static final String CONTENT = "HAM, CHEESE, MUSHROOMS";

    @Override
    public String showPizza() {
        return CONTENT;
    }
}
