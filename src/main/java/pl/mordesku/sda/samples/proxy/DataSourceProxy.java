package pl.mordesku.sda.samples.proxy;

import pl.mordesku.sda.samples.proxy.other.datasource.SomeOtherDatasourceAdapter;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:54
 */
public class DataSourceProxy implements DataSource {
    DataSource dataSource = new SomeOtherDatasourceAdapter();
    @Override
    public String getData() {
        return dataSource.getData();
    }
}
