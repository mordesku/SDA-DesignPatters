package pl.mordesku.sda.basic.instructions;

/**
 * Created by mordesku on 17.09.2017.
 */
public interface Instruction {
    boolean isApplicable(String rawInstruction);
    void execute(String rawInstruction);
}
