package pl.mordesku.sda.samples.proxy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:54
 */
public class DataSourceProxy implements DataSource {
    DatabaseDataSource dataSource = new DatabaseDataSource();
    @Override
    public String getData() {
        return dataSource.getData();
    }
}
