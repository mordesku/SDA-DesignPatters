package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:01
 */
public class Child extends Person {
    public Child() {
        super(new ChildScoreCalculateStrategy());
    }
}
