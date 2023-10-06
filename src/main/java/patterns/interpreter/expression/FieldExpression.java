package patterns.interpreter.expression;

import patterns.interpreter.context.Context;

/**
 * @author nerzon
 */
public class FieldExpression extends AbstractExpression{
    private final String value;

    public FieldExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void interpret(Context context) {
       context.addField(this);
    }
}
