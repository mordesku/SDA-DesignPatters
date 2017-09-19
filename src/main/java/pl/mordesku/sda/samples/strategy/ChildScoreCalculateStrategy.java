package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:03
 */
public class ChildScoreCalculateStrategy implements ScoreCalculateStrategy {
    @Override
    public boolean passed(Integer time) {
        return time < 100;
    }
}
