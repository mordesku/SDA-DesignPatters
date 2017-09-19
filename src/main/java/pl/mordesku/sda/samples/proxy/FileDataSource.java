package pl.mordesku.sda.samples.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-19
 * Time: 20:35
 */
public class FileDataSource implements DataSource {
    @Override
    public String getData() {
        try {
            return new Scanner(new File("someData.txt")).nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "error :(";
        }
    }
}
