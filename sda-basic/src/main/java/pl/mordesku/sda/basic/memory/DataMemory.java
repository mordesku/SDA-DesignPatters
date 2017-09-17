package pl.mordesku.sda.basic.memory;

/**
 * Created by mordesku on 17.09.2017.
 */
public class DataMemory extends Memory {
    private static DataMemory INSTANCE = new DataMemory();

    public static DataMemory getInstance() {
        return INSTANCE;
    }

    private DataMemory() {

    }
}
