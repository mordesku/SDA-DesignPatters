package pl.mordesku.sda.basic.memory;

import java.util.Collections;
import java.util.List;

/**
 * Created by mordesku on 17.09.2017.
 */
public class ProgramMemory extends Memory {
    private static ProgramMemory INSTANCE;

    private int programCounter = 0;

    private List<String> addresses;

    private ProgramMemory() {

    }

    public static ProgramMemory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProgramMemory();
        }
        return INSTANCE;
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
