package pl.mordesku.sda.basic.expressions;

import pl.mordesku.sda.basic.memory.DataMemory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2017-09-18
 * Time: 19:49
 */
public class EvaluateVariableExpression implements Expression {
    public static final String VARIABLE_REGEXP = "(\\$[a-zA-Z0-9]+)";
    public static final Pattern VARIABLE_PATTER = Pattern.compile(VARIABLE_REGEXP);

    @Override
    public String evaluate(String expression) {
        Matcher matcher = VARIABLE_PATTER.matcher(expression);
        while (matcher.find()) {
            String variableName = matcher.group();
            String variableValue = DataMemory.getInstance().get(variableName);
            expression = expression.replace(variableName, variableValue);
        }
        return expression;
    }
}
