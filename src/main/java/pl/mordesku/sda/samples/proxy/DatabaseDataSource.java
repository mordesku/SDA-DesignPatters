package pl.mordesku.sda.samples.proxy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:50
 */
public class DatabaseDataSource implements DataSource {
    @Override
    public String getData() {
        return "SOME DATA";
    }
}
