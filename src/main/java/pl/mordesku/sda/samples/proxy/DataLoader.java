package pl.mordesku.sda.samples.proxy;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 18:52
 */
public class DataLoader {
    static DataSource dataSource = new DataSourceProxy();
    public static void main(String[] args) {
        System.out.println(dataSource.getData());
    }
}
