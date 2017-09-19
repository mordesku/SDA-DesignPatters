package pl.mordesku.sda.samples.proxy.other.datasource;

import pl.mordesku.sda.samples.proxy.DataSource;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:42
 */
public class SomeOtherDatasourceAdapter implements DataSource {

    private SomeOtherDatasource someOtherDatasource = new SomeOtherDatasource();;

    @Override
    public String getData() {
        return someOtherDatasource.getOtherData();
    }
}
