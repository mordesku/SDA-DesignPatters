package pl.mordesku.sda.basic.instructions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mordesku on 17.09.2017.
 */
public class Instructions implements Instruction {
    private List<Instruction> availableInstructions = new ArrayList<>();

    public Instructions() {
        initInstructions();
    }

    private void initInstructions() {
        availableInstructions.add(new PrintInstruction());
        availableInstructions.add(new GoToInstruction());
    }

    @Override
    public boolean isApplicable(String rawInstruction) {
        return true;
    }

    @Override
    public void execute(String rawInstruction) {
        for (Instruction availableInstruction : availableInstructions) {
            if (availableInstruction.isApplicable(rawInstruction)) {
                availableInstruction.execute(rawInstruction);
                return;
            }
        }
        System.out.println("ERROR: UNKNOWN COMMAND\n\t"+rawInstruction);
        System.exit(-33);
    }
}
