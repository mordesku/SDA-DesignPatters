package pl.mordesku.sda.basic;

import pl.mordesku.sda.basic.expressions.SimpleMathExpression;
import pl.mordesku.sda.basic.instructions.Instructions;
import pl.mordesku.sda.basic.memory.ProgramMemory;

import java.util.List;

/**
 * Created by mordesku on 17.09.2017.
 */
public class Interpreter {
    private ProgramMemory programMemory = ProgramMemory.getInstance();

    private Instructions instructions = new Instructions();

    public void start() {
        List<String> addresses = programMemory.addresses();
        for (programMemory.setProgramCounter(0);
             programMemory.getProgramCounter() < addresses.size();) {
            String instructionAddress = addresses.get(programMemory.getProgramCounter());
            String instruction = programMemory.get(instructionAddress);
            programMemory.incrementProgramCounter();
            instruction = new SimpleMathExpression().evaluate(instruction);
            instructions.execute(instruction);
        }

    }
}
