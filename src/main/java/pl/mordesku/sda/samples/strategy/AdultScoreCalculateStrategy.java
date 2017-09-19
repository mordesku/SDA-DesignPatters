package pl.mordesku.sda.samples.strategy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:10
 */
public class AdultScoreCalculateStrategy implements ScoreCalculateStrategy {
    @Override
    public boolean passed(Integer time) {
        return time < 80;
    }
}
