package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:09
 */
public class Adult extends Person {
    public Adult() {
        super(new AdultScoreCalculateStrategy());
    }
}
