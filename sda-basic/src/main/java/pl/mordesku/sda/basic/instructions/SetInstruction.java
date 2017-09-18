package pl.mordesku.sda.basic.instructions;

import pl.mordesku.sda.basic.memory.DataMemory;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-18
 * Time: 18:43
 */
public class SetInstruction implements Instruction {
    public static final String SET_REGEXP = "(SET )([a-zA-Z0-9]+)(=)(.+)";

    @Override
    public boolean isApplicable(String rawInstruction) {
        return rawInstruction.matches(SET_REGEXP);
    }

    @Override
    public void execute(String rawInstruction) {
        String variableName = rawInstruction.replaceAll(SET_REGEXP, "$2");
        String variableVal = rawInstruction.replaceAll(SET_REGEXP, "$4");
        DataMemory.getInstance().put("$"+variableName, variableVal);

    }
}
