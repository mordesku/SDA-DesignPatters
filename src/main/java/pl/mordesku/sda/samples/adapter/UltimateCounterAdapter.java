package pl.mordesku.sda.samples.adapter;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:28
 */
public class UltimateCounterAdapter implements Counter {
    UltimateCounter ultimateCounter = new UltimateCounter();
    @Override
    public int count() {
        return Integer.valueOf(ultimateCounter.ultimateCount().replace("TotalCount: ", ""));
    }
}
