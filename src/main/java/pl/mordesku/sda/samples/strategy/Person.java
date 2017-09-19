package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 19:56
 */
public abstract class Person {
    private ScoreCalculateStrategy strategy;

    public Person(ScoreCalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean passed(Integer time) {
        return strategy.passed(time);
    }
}
