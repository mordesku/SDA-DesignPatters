package pl.mordesku.sda.samples.adapter;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:23
 */
public class ShowCounter {
    public static void main(String[] args) {
        Counter counterService = new UltimateCounterAdapter();
        //
        for (int i = 0; i < 10; i++) {
            System.out.println(counterService.count());
        }

    }
}
