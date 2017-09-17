package pl.mordesku.sda.basic.expressions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mordesku on 17.09.2017.
 */
public class SimpleMathExpression implements Expression {

    public static final String MATCHER_REGEXP = "(\\d+)([+\\-*/])(\\d+)";
    public static final Pattern MATH_PATTERN = Pattern.compile(MATCHER_REGEXP);

    @Override
    public String evaluate(String expression) {
        Matcher matcher = MATH_PATTERN.matcher(expression);
        while (matcher.find()) {
            String group = matcher.group();
            Integer left = Integer.valueOf(group.replaceAll(MATCHER_REGEXP, "$1"));
            String sign = group.replaceAll(MATCHER_REGEXP, "$2");
            Integer right = Integer.valueOf(group.replaceAll(MATCHER_REGEXP, "$3"));
            Integer result = 0;
            switch (sign) {
                case "+":
                    result = left+right;
                    break;
                case "-":
                    result = left-right;
                    break;
                case "*":
                    result = left*right;
                    break;
                case "/":
                    result = left/right;
                    break;

            }
            expression = expression.replace(group, result.toString());
        }
        return expression;
    }
}
