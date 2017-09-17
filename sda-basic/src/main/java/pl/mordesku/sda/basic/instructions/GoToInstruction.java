package pl.mordesku.sda.basic.instructions;

import pl.mordesku.sda.basic.memory.ProgramMemory;

import java.util.List;

/**
 * Created by mordesku on 17.09.2017.
 */
public class GoToInstruction implements Instruction {

    private static final String INSTRUCTION_REGEXP = "(GOTO )(\\d+)";

    private ProgramMemory programMemory = ProgramMemory.getInstance();

    @Override
    public boolean isApplicable(String rawInstruction) {
        return rawInstruction.matches(INSTRUCTION_REGEXP);
    }

    @Override
    public void execute(String rawInstruction) {
        List<String> addresses = programMemory.addresses();
            int gotoLine = addresses.indexOf(rawInstruction.replaceAll(INSTRUCTION_REGEXP, "$2"));
            if (gotoLine>=0) {
                programMemory.setProgramCounter(gotoLine);
            } else {
                System.out.println("ERROR: LINE NOT FOUND\n\t"+rawInstruction);
                System.exit(-33);
            }
    }
}
