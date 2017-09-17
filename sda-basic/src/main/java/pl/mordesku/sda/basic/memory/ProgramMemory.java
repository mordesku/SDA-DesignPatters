package pl.mordesku.sda.basic.memory;

import java.util.Collections;
import java.util.List;

/**
 * Created by mordesku on 17.09.2017.
 */
public class ProgramMemory extends Memory {
    private static ProgramMemory INSTANCE = new ProgramMemory();

    public static ProgramMemory getInstance() {
        return INSTANCE;
    }

    private int programCounter = 0;

    private List<String> addresses;

    private ProgramMemory() {

    }

    public int getProgramCounter() {
        return programCounter;
    }

    public int setProgramCounter(int programCounter) {
        this.programCounter = programCounter;
        return programCounter;
    }

    public int incrementProgramCounter() {
        return ++programCounter;
    }

    @Override
    public List<String> addresses() {
        if (addresses == null) {
            addresses = Collections.unmodifiableList(super.addresses());
        }
        return addresses;
    }
}
