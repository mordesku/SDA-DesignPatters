package pl.mordesku.sda.basic.instructions;

/**
 * Created by mordesku on 17.09.2017.
 */
public class PrintInstruction implements Instruction {
    private static final String INSTRUCTION_REGEXP = "(PRINT )(.+)";
    @Override
    public boolean isApplicable(String rawInstruction) {
        return rawInstruction.matches(INSTRUCTION_REGEXP);
    }

    @Override
    public void execute(String rawInstruction) {
        System.out.println(rawInstruction.replaceAll(INSTRUCTION_REGEXP, "$2"));
    }
}
