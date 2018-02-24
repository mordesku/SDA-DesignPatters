package pl.mordesku.sda.samples.adapter;

/**
 * Created with notepad.exe.
 * Author: mprzy
 * Date: 23.02.2018
 * Time: 21:06
 */
public class ShowCounter implements Counter {
    private int counter = 0;

    @Override
    public int count() {
        return counter++;
    }
}
